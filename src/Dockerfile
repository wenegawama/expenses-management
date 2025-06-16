#USE A IMAGEM DO MAVEN PARA COMPILAR A APLICAÇÃO
FROM maven:3.8.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

#USE UMA IMAGEM DO JDK PARA RODAR O .JAR GERADO
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]