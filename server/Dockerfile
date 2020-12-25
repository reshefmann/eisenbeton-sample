FROM golang:1.15-alpine

EXPOSE 8500

RUN apk add git
RUN apk add make
RUN git clone https://github.com/reshefmann/eisenbeton-go.git
WORKDIR eisenbeton-go
COPY config.edn config.edn
RUN cat config.edn

CMD ["make", "run"]

