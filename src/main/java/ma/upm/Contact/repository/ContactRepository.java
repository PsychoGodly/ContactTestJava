package com.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.model.CContact;

public interface ContactRepository extends JpaRepository<CContact, Long> {

}