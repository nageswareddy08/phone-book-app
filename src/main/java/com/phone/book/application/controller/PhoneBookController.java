package com.phone.book.application.controller;

import com.phone.book.application.model.PhoneBook;
import com.phone.book.application.service.PhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PhoneBookController {
    @Autowired
    PhoneBookService phoneBookService;

    @GetMapping(value = {"/", "/home"})
    public String index(Model model) {
        List<PhoneBook> phoneBookList = phoneBookService.getAllPhoneBookEntries();
        model.addAttribute("phoneBookList", phoneBookList);
        return "home";
    }

    @GetMapping("/addPhoneBook")
    String addPhoneBook(Model model) {
        PhoneBook phoneBook = new PhoneBook();
        model.addAttribute("newPhoneBook", phoneBook);
        model.addAttribute("adding", true);
        return "addPhoneBook";
    }

    @PostMapping("/addPhoneBook")
    public String addPhoneBook(@ModelAttribute("newPhoneBook") PhoneBook phoneBook, BindingResult result,
                               HttpServletRequest request, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("adding", true);
            return "addContact";
        }
        if (phoneBook != null) {
            phoneBookService.addPhoneBookEntry(phoneBook);
        }
        return "redirect:/home";
    }


}
