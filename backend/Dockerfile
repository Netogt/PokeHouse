# Stage 1: build com Maven e JDK 21
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app

# Copia apenas o pom.xml para cache de dependências
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia o restante do projeto e empacota
COPY src ./src
RUN mvn clean package -DskipTests -B

# Stage 2: runtime com JRE 21 leve
FROM eclipse-temurin:21-jre AS runtime
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
