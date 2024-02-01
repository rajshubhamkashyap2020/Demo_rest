FROM openjdk:21
EXPOSE 8085
ADD target/restdemo-0.0.1-SNAPSHOT.jar app1.jar
ENTRYPOINT ["java","-jar","restdemo-0.0.1-SNAPSHOT.jar"]