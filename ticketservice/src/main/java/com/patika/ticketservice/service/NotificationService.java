package com.patika.ticketservice.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Async
    public void sendSms(String phoneNumber, String message) {

    }

    @Async
    public void sendEmail(String email, String subject, String body) {

    }

    @Async
    public void sendPushNotification(String userId, String message) {

    }
}
