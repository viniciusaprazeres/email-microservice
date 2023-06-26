package com.viniciusaprazeres.email.repository;

import com.viniciusaprazeres.email.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
