package com.phone.book.application.util;

import com.phone.book.application.model.PhoneBook;

public class PhoneBookUtil {
    public static PhoneBook convertEntityToModel(com.phone.book.application.entity.PhoneBook phoneBook){
        PhoneBook modelPhoneBook = new PhoneBook();
        modelPhoneBook.setId(phoneBook.getId());
        modelPhoneBook.setName(phoneBook.getName());
        modelPhoneBook.setPhoneNumber(phoneBook.getPhoneNumber());
        return modelPhoneBook;
    }

    public static com.phone.book.application.entity.PhoneBook convertModelToEntity(PhoneBook phoneBook){
        com.phone.book.application.entity.PhoneBook entityPhoneBook = new com.phone.book.application.entity.PhoneBook();
        entityPhoneBook.setId(phoneBook.getId());
        entityPhoneBook.setName(phoneBook.getName());
        entityPhoneBook.setPhoneNumber(phoneBook.getPhoneNumber());
        return entityPhoneBook;
    }
}
