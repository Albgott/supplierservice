FROM openjdk:17-jdk-slim
EXPOSE 8096
WORKDIR /app
COPY target/*.jar /app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]
