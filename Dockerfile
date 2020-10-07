# EXPOSE 8085 es el puerto del archivo properties o Yaml del aplicacion

FROM openjdk:8-jre-alpine
EXPOSE 8085
ADD skip-payment-mn-service/target/skip-payment-mn-service-0.0.1-SNAPSHOT.jar skip-payment-mn-service-0.0.1.jar
ENTRYPOINT ["java","-jar","/skip-payment-mn-service-0.0.1.jar"]
