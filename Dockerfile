FROM khipu/openjdk17-alpine

RUN mkdir /app

COPY target/pessoa-api-0.0.1-SNAPSHOT.jar /app/pessoa-api-0.0.1-SNAPSHOT.jar

EXPOSE 8080

WORKDIR /app

CMD ls -l && java -jar pessoa-api-0.0.1-SNAPSHOT.jar