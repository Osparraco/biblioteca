# Use an official OpenJDK runtime as a parent image
FROM openjdk:21

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file into the container at /app
COPY */target/biblioteca-0.0.1-SNAPSHOT.jar .

# Specify the command to run on container startup
CMD ["java", "-jar", "biblioteca-0.0.1-SNAPSHOT.jar"]