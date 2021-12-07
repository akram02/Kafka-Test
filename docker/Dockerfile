FROM openjdk:11.0.7-jre-slim-buster
COPY kafka.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]