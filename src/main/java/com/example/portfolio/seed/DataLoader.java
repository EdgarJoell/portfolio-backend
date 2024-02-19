package com.example.portfolio.seed;

import com.example.portfolio.model.Contact;
import com.example.portfolio.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    ContactRepository contactRepository;

    @Override
    public void run(String... args) {
        loadUserData();
    }

    private void loadUserData() {
        Contact contact = new Contact(1L, "Edgar", "Zambrana", "Recruiter", "edgarjoel0920@gmail.com", "You the best championship coders!");

        contactRepository.save(contact);
    }
}
