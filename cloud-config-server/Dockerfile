FROM maven:3.9.6-eclipse-temurin-21 as builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
EXPOSE 8888
COPY --from=builder /app/target/cloud-config-server-1.0.jar cloud-config-server.jar
ENTRYPOINT ["java", "-jar", "/app/cloud-config-server.jar"]