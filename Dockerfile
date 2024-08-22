#Build stage

FROM gradle:jdk17-alpine AS BUILD
WORKDIR /home/gradle/src
COPY . .
RUN gradle build -x test

# Package stage

FROM eclipse-temurin:17-jre-alpine
ENV JAR_NAME=db-manager-0.0.1-SNAPSHOT.jar
ENV APP_HOME=/home/gradle/src
WORKDIR $APP_HOME
COPY --from=BUILD $APP_HOME .
EXPOSE 8080
ENTRYPOINT exec java -jar $APP_HOME/build/libs/$JAR_NAME