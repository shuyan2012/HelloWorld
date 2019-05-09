FROM java:8-alpine
ADD ./deploy_d/jar/20190509161555/springboot-helloword demo.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","/demo.jar"]