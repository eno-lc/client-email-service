package com.mail.client.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "emails")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Email {
    private String to;
    private String subject;
    private String body;
}
