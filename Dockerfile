#JAR
FROM openjdk:8
WORKDIR /
ADD target/bootcamp-avengers-category.jar bootcamp-avengers-category.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "bootcamp-avengers-category.jar"]