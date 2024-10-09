package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AppTest {

    @Test
    void contextLoads() {
        // Проверка, что контекст приложения загружается корректно
    }

    @Test
    void testGreet() {
        HelloController controller = new HelloController();
        String result = controller.greet();
        assertEquals("Hello, Spring with Gradle!", result);
    }
}