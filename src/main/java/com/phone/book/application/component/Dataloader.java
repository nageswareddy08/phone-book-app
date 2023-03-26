package com.phone.book.application.component;

import com.phone.book.application.entity.PhoneBook;
import com.phone.book.application.repository.PhoneBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Dataloader implements CommandLineRunner {
    @Autowired
    PhoneBookRepository phoneBookRepository;
    @Override
    public void run(String... args) throws Exception {
        PhoneBook phoneBookOne = new PhoneBook();
        phoneBookOne.setName("Name-1");
        phoneBookOne.setPhoneNumber(8019674554L);
        PhoneBook phoneBookTwo = new PhoneBook();
        phoneBookTwo.setName("Name-2");
        phoneBookTwo.setPhoneNumber(8019674555L);
        phoneBookRepository.saveAll(Arrays.asList(phoneBookOne,phoneBookTwo));
    }
}
