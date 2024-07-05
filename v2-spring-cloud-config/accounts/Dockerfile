# Start with a base image containing Java runtime
FROM openjdk:21-jdk-slim

# Add Maintainer Info apparently deprecated
#MAINTAINER "Duncan"

#Other solution more flexible
LABEL org.opencontainers.image.authors="Duncan"

COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Will execute the following command who will start the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]
