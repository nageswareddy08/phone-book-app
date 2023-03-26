package com.phone.book.application.service;

import com.phone.book.application.model.PhoneBook;

import java.util.List;

public interface PhoneBookService {
    String addPhoneBookEntry(PhoneBook phoneBook);
    List<PhoneBook> getAllPhoneBookEntries();

    String deletePhoneBook(Integer phoneBookId);
}
