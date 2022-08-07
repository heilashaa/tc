package com.example.tc.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest
{

    @Test
    void hello()
    {
        HelloController controller = new HelloController();
        String response = controller.hello("World");
        assertEquals("Hello, World", response);
    }
}
