FROM openjdk:21-jdk-slim as builder
WORKDIR /app
COPY target/secure-java21-gsm-api-*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
