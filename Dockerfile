FROM maven:3.8.5-openjdk-11

WORKDIR /tmp
ADD . /tmp

RUN gradle build

CMD ["mvnw", "clean", "spring-boot:run"]
EXPOSE 3000