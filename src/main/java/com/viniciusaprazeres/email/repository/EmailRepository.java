package com.viniciusaprazeres.email.repository;

import com.viniciusaprazeres.email.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {

}
