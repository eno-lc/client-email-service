package com.mail.client.repository;

import com.mail.client.entity.Email;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmailRepository extends MongoRepository<Email, Long> {
}
