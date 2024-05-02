package ru.gb.Spring_Security_HW7.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getText() {
        return "Home Page";
    }

}