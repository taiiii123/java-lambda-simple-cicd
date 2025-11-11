package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class HandlerTest {

    @Test
    public void testHandleRequest() {
        Handler handler = new Handler();
        Map<String, String> event = new HashMap<>();
        event.put("name", "Lambda");

        String result = handler.handleRequest(event, null);
        assertEquals("Hello, aaa!", result);
    }

    @Test
    public void testProcessMessage() {
        Handler handler = new Handler();
        String result = handler.processMessage("test");
        assertEquals("Processed: aaa", result);
    }
}
