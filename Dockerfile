FROM openjdk:8-jre
MAINTAINER Ayuancool <303148062@qq.com>

ENV APP_VERSION 1.0.0-SNAPSHOT

RUN mkdir /app
COPY target/test-$APP_VERSION.jar /app/app.jar

# 默认执行
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar"]

EXPOSE 8080