package com.patika.ticketservice.Producer.dto.response;


import com.patika.ticketservice.model.StatusType;

public class UserResponse {

    private String email;
    private StatusType statusType;

    public UserResponse(String email, StatusType statusType) {
        this.email = email;
        this.statusType = statusType;
    }

    // Getters and setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StatusType getStatusType() {
        return statusType;
    }

    public void setStatusType(StatusType statusType) {
        this.statusType = statusType;
    }
}
