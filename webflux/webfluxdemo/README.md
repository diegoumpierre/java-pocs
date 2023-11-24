# WebFlux Demo

This POC is to show a simple example for Create and retrieve items from H2 Database.
This example was used to show how the Stream workflow works.

After clone the repository, go in the path and type:
mvn clean install

To run, execute: mvn spring-boot:run

Access:
http://localhost:9192/

customers/ <-- get all lines from the database

/streamblock --> simulate a part with stream and final response with block way


/streamdelay <-- get registers simulate a delay per item