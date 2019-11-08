package com.facetable.service;

import com.facetable.model.Contact;
import com.facetable.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

  @Autowired
 ContactRepository contactRepository;

  public List<Contact> getAll() {
    return contactRepository.findAll();
  }

  public Optional<Contact> get(int id) {
    return contactRepository.findById( id);
  }



}
