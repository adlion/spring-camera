FROM openjdk:11
EXPOSE 8080
ADD /target/camera-rest-0.0.1-SNAPSHOT.jar camera-rest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","camera-rest-0.0.1-SNAPSHOT.jar"]