package com.chatbot.web.progress;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProgressControllerTest {
    @LocalServerPort private int port;
    @Autowired private TestRestTemplate restTemplate;
    @Test public void getHello() throws Exception {
        ResponseEntity<String> response = restTemplate.getForEntity(new URL("http://localhost:" + port + "/progresses/hello").toString(), String.class);
        assertEquals("hello", response.getBody());
    }
}

