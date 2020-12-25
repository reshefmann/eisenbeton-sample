(ns eisenbeton-sample.core
  (:require [eisenbeton-client-clj.core :as eb]))



(defn sample-handler
  [msg nats-conn reply-to]

  (println msg)

  (eb/publish-response 
    nats-conn 
    reply-to
    (eb/build-eisen-response 
      #:response{:status 200 
                 :headers [["Content-Type" "text/plain"]] 
                 :content (byte-array [77 78 79])}))
  )

(defn run
  [opts]
  (let [nats-conn (eb/create-nats-conn "nats://nats:4222")
        cancel (eb/start-listening nats-conn "lb-queue" "/test" sample-handler)]
    (println "Press <enter> to quit")
    (read-line)  
    ))



