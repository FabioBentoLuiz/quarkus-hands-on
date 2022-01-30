package org.fabio.quarkus.microservice.book;

import io.quarkus.test.Mock;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Mock
@RestClient
public class MockNumberProxy implements NumberProxy {
    @Override
    public IsbnThirteen generateIsbnNumbers() {
        var isbn = new IsbnThirteen();
        isbn.isbn13 = "13-mock";
        return isbn;
    }
}
