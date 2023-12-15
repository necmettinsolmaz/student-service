package com.codershere.studentservice.controller;

import com.codershere.studentservice.consumer.BookRestConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRestController {
    @Autowired
    private BookRestConsumer consumer;
    @GetMapping("/data")
    public String getStudentInfo(){
        System.out.println(consumer.getClass().getName());
        return "student servisten erişiyoruz:" + consumer.getBookData();
    }
    @GetMapping("/allBooks")
    public String getAllBooks(){
        System.out.println(consumer.getClass().getName());
        return "student servisten erişiyoruz:" + consumer.getAll();
    }

    @GetMapping("/getOneBook/{id}")
    public String getOneBookForStd(){
        return "getOneBookForStd";
    }
}
