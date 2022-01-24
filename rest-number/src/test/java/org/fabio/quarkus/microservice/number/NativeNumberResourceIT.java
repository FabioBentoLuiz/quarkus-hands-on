package org.fabio.quarkus.microservice.number;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeNumberResourceIT extends NumberResourceTest {

    // Execute the same tests but in native mode.
}