# Imagine Maven + JDK 17
FROM maven:3.9.5-eclipse-temurin-17

# Creează folder de lucru
WORKDIR /app

# Copiază fișierul pom.xml și codul sursă
COPY pom.xml .
COPY src ./src

# Compilează proiectul Maven
RUN mvn clean package

# Expune portul 3000 (cum am setat în App.java)
EXPOSE 3000

# Rulează aplicația
CMD ["mvn", "exec:java", "-Dexec.mainClass=com.example.App"]
