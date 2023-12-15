package com.codershere.studentservice.consumer;

import com.codershere.studentservice.proxy.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="book-service")
public interface BookRestConsumer {
    @GetMapping("/book/data")
    public String getBookData();
    @GetMapping("/book/{id}")
    public String getBookById(@PathVariable Integer id);

    @GetMapping("/book/all")
    public List<Book> getAll();
}
