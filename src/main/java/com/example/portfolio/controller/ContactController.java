package com.example.portfolio.controller;

import com.example.portfolio.model.Contact;
import com.example.portfolio.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/contact")
public class ContactController {
    private ContactService contactService;

    @Autowired
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping(path = "/{contact}/sent")
    public String sendContactSheet(@PathVariable Contact contact) {
        return contactService.sendContactSheet(contact);
    }
}
