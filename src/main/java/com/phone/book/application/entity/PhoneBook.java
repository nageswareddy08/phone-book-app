package com.phone.book.application.entity;

import javax.persistence.*;

@Entity
@Table(name = "PHONE_BOOK")
public class PhoneBook {
    @Id
    @GeneratedValue
    @Column(name = "PHONE_BOOK_ID")
    private Integer Id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PHONE_NUMBER")
    private Long phoneNumber;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
