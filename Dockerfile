From openjdk:17
copy ./target/DockerBootDemo-0.0.1-SNAPSHOT.jar DockerBootDemo-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","DockerBootDemo-0.0.1-SNAPSHOT.jar"]