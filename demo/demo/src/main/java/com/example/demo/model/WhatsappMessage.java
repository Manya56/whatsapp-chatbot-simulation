package com.example.demo.model;

public class WhatsappMessage {
    private String sender;
    private String text;

    // Getters and Setters (Important for Spring Boot to read JSON)
    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
}
