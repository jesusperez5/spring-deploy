FROM amazoncorretto:17-alpine-jdk

COPY target/spring-deply-1.0.jar app.jar

ENTRYPOINT [ "java" , "-jar", "/app.jar" ]