package com.Vaika.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Vaika.modele.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}

