package com.devsecops.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HealthControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void healthEndpointShouldReturnUp() {

        String response = restTemplate.getForObject(
                "http://localhost:" + port + "/health",
                String.class);

        assertEquals("UP", response);
    }

    @Test
    void homeEndpointShouldReturnMessage() {

        String response = restTemplate.getForObject(
                "http://localhost:" + port + "/",
                String.class);

        assertEquals(
                "Java DevSecOps Application is running!",
                response);
    }
}