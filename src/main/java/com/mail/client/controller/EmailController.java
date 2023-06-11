package com.mail.client.controller;

import com.mail.client.request.EmailRequest;
import com.mail.client.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1/email-client")
public class EmailController {
    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public void sendEmail(@RequestBody EmailRequest emailRequest) {
        // Extract recipient, subject, and body from the emailRequest
        String to = emailRequest.getTo();
        String subject = "Reservation Confirmation";
        String body = "Your reservation has been confirmed.";

        // Send the email
        emailService.sendEmail(to, subject, body);
    }
}
