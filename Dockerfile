FROM eclipse-temurin:11-jdk-alpine AS builder

COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew bootJar

FROM eclipse-temurin:11-jdk-alpine
COPY --from=builder build/libs/*.jar app.jar
