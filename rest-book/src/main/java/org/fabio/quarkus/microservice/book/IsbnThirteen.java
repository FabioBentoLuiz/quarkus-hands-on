package org.fabio.quarkus.microservice.book;

import javax.json.bind.annotation.JsonbProperty;

public class IsbnThirteen {

    @JsonbProperty("isbn_13")
    public String isbn13;

    @Override
    public String toString() {
        return "IsbnThirteen{" +
                "isbn13='" + isbn13 + '\'' +
                '}';
    }
}
