FROM openjdk:8-jre
MAINTAINER Ayuancool <303148062@qq.com>

ENV APP_VERSION 0.0.1-SNAPSHOT

RUN mkdir /app
COPY target/usage-cicd-$APP_VERSION.jar /app/app.jar


ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar"]

EXPOSE 8080
