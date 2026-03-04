FROM eclipse-temurin:11

WORKDIR /app

COPY target/scientific-calculator-1.0-SNAPSHOT.jar /app/scientific-calculator.jar

CMD ["java", "-jar", "/app/scientific-calculator.jar"]