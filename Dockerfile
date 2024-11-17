FROM openjdk:21-jdk-slim as builder
WORKDIR /app
COPY target/secure-java21-gsm-api-1.0.0-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
