FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8080
RUN mkdir -p /app/

# Path located in build/libs/*.jar
ADD build/libs/media-library-plain.jar /app/media-library-plain.jar

ENTRYPOINT ["java", "-jar", "/app/media-library-plain.jar"]
