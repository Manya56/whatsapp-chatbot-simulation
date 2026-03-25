package com.example.demo.controller;

import com.example.demo.model.WhatsappMessage;
import org.springframework.web.bind.annotation.*;

@RestController // Tells Spring this class handles Web/API requests
public class ChatbotController {

    @PostMapping("/webhook") // This listens for POST requests at http://localhost:8080/webhook
    public String handleMessage(@RequestBody WhatsappMessage message) {
       
        // 1. Requirement: Log all incoming messages to the console
        System.out.println("Received from " + message.getSender() + ": " + message.getText());

        // 2. Requirement: Predefined replies logic
        String userText = message.getText().toLowerCase();

        if (userText.contains("hi")) {
            return "Hello! How can I help you today?";
        } else if (userText.contains("bye")) {
            return "Goodbye! Have a great day.";
        } else {
            return "I am a bot. Please say 'Hi' or 'Bye'.";
        }
    }
}
