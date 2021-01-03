FROM openjdk:11
MAINTAINER jsierra93@hotmail.com
#USER jsierra93
LABEL service.name=Client-Service
EXPOSE 8081
COPY build/libs/clientes-1.0.0-SNAPSHOT.jar clientes.jar
CMD ["java", "-jar", "clientes.jar"]