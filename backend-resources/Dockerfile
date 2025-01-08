FROM maven:3.9.6-eclipse-temurin-17 as builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY ./src ./src
RUN mvn clean package -DskpiTests


FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
EXPOSE 8080
COPY --from=builder /app/target/backend-resources-0.0.4-SNAPSHOT.jar backend-resources.jar
ENTRYPOINT ["java", "-jar", "/app/backend-resources.jar"]
