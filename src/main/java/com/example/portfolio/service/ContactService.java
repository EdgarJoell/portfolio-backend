package com.example.portfolio.service;

import com.example.portfolio.exception.ContactNotSentException;
import com.example.portfolio.model.Contact;
import com.example.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    private ContactRepository contactRepository;

    @Autowired
    public void setContactRepository(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAllContactForms() {
        return this.contactRepository.findAll();
    }

    public Contact saveContactSheet(Contact contact) {
        contactRepository.save(contact);
        Optional<Contact> repoCheck = contactRepository.findById(contact.getId());
        if(repoCheck.isEmpty()) {
            throw new ContactNotSentException("There has been an error with sending your contact form");
        }

        return contact;
    }

}
