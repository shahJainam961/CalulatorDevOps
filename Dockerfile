FROM openjdk
WORKDIR ./
COPY target/calculator-1.0-SNAPSHOT.jar .
CMD ["java", "-jar", "calculator-1.0-SNAPSHOT.jar"]
