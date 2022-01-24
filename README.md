# quarkus-hands-on
Bootstrap `numbers` project.

```shell
mvn -U io.quarkus:quarkus-maven-plugin:create \
-DprojectGroupId=org.fabio.quarkus.microservices \
-DprojectArtifactId=rest-number \
-DclassName="org.fabio.quarkus.microservice.number.NumberResource" \
-Dpath="/api/numbers" \
-Dextensions="resteasy-jsonb, smallrye-openapi"
```

Bootstrap `book` project

```shell
mvn -U io.quarkus:quarkus-maven-plugin:create \
-DprojectGroupId=org.fabio.quarkus.microservices \
-DprojectArtifactId=rest-book \
-DclassName="org.fabio.quarkus.microservice.book.BookResource" \
-Dpath="/api/books" \
-Dextensions="resteasy-jsonb, smallrye-openapi"
```