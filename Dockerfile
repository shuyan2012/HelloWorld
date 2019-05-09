FROM java:8-alpine
ADD springboot-helloword demo.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","/demo.jar"]