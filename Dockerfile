
FROM openjdk:11-jre-slim

WORKDIR /usr/src/myapp


COPY . .


RUN javac primeno.java

CMD ["java", "primeno"]
