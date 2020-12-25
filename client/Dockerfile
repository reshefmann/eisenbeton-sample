FROM clojure:latest


RUN apt-get update && apt-get install -y git
WORKDIR /
RUN git clone https://github.com/reshefmann/eisenbeton-client-clj.git
WORKDIR /eisenbeton-client-clj
RUN lein install


RUN mkdir /eisenbeton_sample
WORKDIR /eisenbeton_sample
COPY deps.edn ./
COPY src/eisenbeton_sample/* ./src/eisenbeton_sample/
RUN clj -P -M:dev

RUN echo $PWD
CMD ["/usr/local/bin/clj",  "-X", "eisenbeton-sample.core/run"]
#CMD ["/bin/bash"]


