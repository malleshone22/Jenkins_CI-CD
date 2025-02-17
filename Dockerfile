FROM openjdk:17
WORKDIR /app
COPY ./target/rest-docker-app.jar /app
EXPOSE 8787
CMD ["java","-jar","rest-docker-app.jar"]


