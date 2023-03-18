FROM openjdk
WORKDIR ./
COPY target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar .
CMD ["java", "-jar", "calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
