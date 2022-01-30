package org.fabio.quarkus.microservice.book;


import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.Instant;

@Path("/api/books")
@Tag(name = "Book Rest endpoint")
public class BookResource {

    @Inject
    Logger logger;

    @Inject
    @RestClient
    NumberProxy proxy;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Operation(summary = "Creates a Book", description = "Creates a Booke with an ISBN number")
    public Response createBook(@FormParam("title") String title,@FormParam("author") String author, @FormParam("year") int yearOfPublication, @FormParam("genre") String genre) {
        var book = new Book();
        var num =proxy.generateIsbnNumbers();
        logger.info("ISBN received: " + num);
        book.isbn13 = num.isbn13;
        book.title = title;
        book.author = author;
        book.yearOfPublication = yearOfPublication;
        book.genre = genre;
        book.creationDate = Instant.now();
        logger.info("Book created: " + book);
        return Response.status(201).entity(book).build();
    }
}