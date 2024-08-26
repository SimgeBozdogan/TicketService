package com.patika.ticketservice.Producer.dto;

public class SendEmailMessage {

    private String email;
    private String template;

    public SendEmailMessage(String email, String template) {
        this.email = email;
        this.template = template;
    }

    // Getters and setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
