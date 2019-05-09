FROM java:8-alpine
ADD springboot-helloword-1.0-SNAPSHOT.jar demo.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","/demo.jar"]