package org.fabio.quarkus.microservice.number;

import javax.json.bind.annotation.JsonbProperty;
import java.time.Instant;

public class IsbnNumbers {

    @JsonbProperty("isbn_10")
    public String isbn10;

    @JsonbProperty("isbn_13")
    public String isbn13;

    public Instant generationDate;

    @Override
    public String toString() {
        return "IsbnNumbers{" +
                "isbn10='" + isbn10 + '\'' +
                ", isbn13='" + isbn13 + '\'' +
                ", generationDate=" + generationDate +
                '}';
    }
}
