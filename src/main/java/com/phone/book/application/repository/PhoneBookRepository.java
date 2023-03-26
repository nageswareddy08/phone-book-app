package com.phone.book.application.repository;

import com.phone.book.application.entity.PhoneBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneBookRepository extends JpaRepository<PhoneBook, Integer> {


}
