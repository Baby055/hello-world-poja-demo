package school.hei.demo.endpoint.rest.controller.health;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldControllerTest {

    @Test
    void helloWorld() {
        assertEquals("Hello World!" , new HelloWorldController().helloWorld());
    }
}