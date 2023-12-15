package com.codershere.studentservice.proxy;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Integer bookId;
    private String bookName;
    private Double bookCost;
}