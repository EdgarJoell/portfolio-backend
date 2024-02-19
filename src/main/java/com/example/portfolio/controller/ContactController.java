package com.example.portfolio.controller;

import com.example.portfolio.model.Contact;
import com.example.portfolio.service.ContactService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/contact")
public class ContactController {
    private ContactService contactService;

    @Autowired
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping(path = "/contacts")
    public List<Contact> getAllContactForms() {
        return this.contactService.getAllContactForms();
    }

    @PostMapping(path = "/sent")
//    @JsonFormat
    public Contact saveContactSheet(@RequestBody Contact contact) {
        return contactService.saveContactSheet(contact);
    }
}
