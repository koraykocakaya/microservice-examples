# base image
FROM openjdk:14

# who maintains image
MAINTAINER korayk

# copy applications jar to container
COPY target/account-0.0.1-SNAPSHOT.jar account-0.0.1-SNAPSHOT.jar

# execute application
ENTRYPOINT ["java", "-jar", "/account-0.0.1-SNAPSHOT.jar"]
