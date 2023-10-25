FROM openjdk:17
ADD target/springboot-Azure2-0.0.1-SNAPSHOT.jar springboot-Azure2.jar
ENTRYPOINT ["java", "-jar", "springboot-Azure2.jar"]