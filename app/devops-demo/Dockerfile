# ===== STAGE 1: Build =====
# Imagine Maven + JDK 17
FROM maven:3.9.5-eclipse-temurin-17 AS build

# Creează folder de lucru
WORKDIR /app

# Copiază fișierul pom.xml 
COPY pom.xml .
RUN mvn dependency:go-offline

# Copiază fișierul src
COPY src ./src

# Compilează proiectul Maven
RUN mvn clean package -DskipTests

# ===== STAGE 2: Runtime =====
FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 3000

CMD ["java", "-jar", "app.jar"]
