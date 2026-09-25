FROM eclipse-temurin:26

WORKDIR /app

COPY build/libs/SWAPI_App-1.0-all.jar SWAPI.jar

ENTRYPOINT ["java","-jar","SWAPI.jar"]
