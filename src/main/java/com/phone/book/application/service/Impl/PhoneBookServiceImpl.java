package com.phone.book.application.service.Impl;

import com.phone.book.application.model.PhoneBook;
import com.phone.book.application.repository.PhoneBookRepository;
import com.phone.book.application.service.PhoneBookService;
import com.phone.book.application.util.PhoneBookUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class PhoneBookServiceImpl implements PhoneBookService {
    @Autowired
    PhoneBookRepository phoneBookRepository;
    @Override
    public String addPhoneBookEntry(PhoneBook phoneBook) {
        com.phone.book.application.entity.PhoneBook entityPhoneBook = PhoneBookUtil.convertModelToEntity(phoneBook);
        try{
            phoneBookRepository.save(entityPhoneBook);
        } catch (Exception e){
            System.out.println("While Saving Phone book failed");
        }
        return "Successfully saved phone book record";
    }

    @Override
    public List<PhoneBook> getAllPhoneBookEntries() {
        List<com.phone.book.application.entity.PhoneBook> phoneBookList = phoneBookRepository.findAll();
        List<PhoneBook> phoneBooks = new ArrayList<>();
        for (com.phone.book.application.entity.PhoneBook phoneBook:phoneBookList ){
            phoneBooks.add(PhoneBookUtil.convertEntityToModel(phoneBook));
        }
        return phoneBooks;
    }

    @Override
    public String deletePhoneBook(Integer phoneBookId) {
        try{
            phoneBookRepository.deleteById(phoneBookId);
        } catch (Exception e){
            System.out.println("While Deleting Phone book failed");
        }
        return "Successfully Deleted phone book record";
    }
}
