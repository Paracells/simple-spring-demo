package com.conferencedemo.demo.repositories;

import com.conferencedemo.demo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
