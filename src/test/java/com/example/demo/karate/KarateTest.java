package com.example.demo.karate;

import com.example.demo.DemoApplication;
import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;


@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class KarateTest {

    @LocalServerPort
    int port;
    final String directory = "classpath:features/";

    @BeforeEach
    public void setUp(){
        System.setProperty("port", String.valueOf(port));
    }

    @Karate.Test
    @DisplayName("Tests for examples")
    Karate createUserRoleController() {
        return Karate.run(directory + "foo.feature");
    }

}
