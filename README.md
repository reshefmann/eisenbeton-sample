# Eisenbeton sample


This project contains a [docker compose](https://docs.docker.com/compose/) sample Eisenbeton setup.

### More details on Eisenbeton can be found [here](https://github.com/reshefmann/eisenbeton-go).

## The setup 
The docker compose setup contains 3 containers - The server, a nats broker and a sample client (handler) implementation.

## Running
```
docker-compose up -d 
```
Then open the browser @ http://localhost:8500/test

## Sample code
Take a look a the sample client implementation [here](client/src/eisenbeton_sample/core.clj)

The client example is currently in Clojure. More sample will be added for each implementation of client libraries in a programming language.


