package org.fabio.quarkus.microservice.book;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;

@QuarkusTest
public class BookResourceTest {

    @Test
    public void shouldCreateBook() {
        final String title = "Understanding Quarkus";
        final String author = "Antonio";
        given()
                .formParam("title", title)
                .formParam("author", author)
                .formParam("year", 2020)
                .formParam("genre", "IT")
          .when().post("/api/books")
          .then()
             .statusCode(201)
             .body("isbn_13", startsWith("13-"))
             .body("title", is(title))
             .body("author", is(author));
    }

}