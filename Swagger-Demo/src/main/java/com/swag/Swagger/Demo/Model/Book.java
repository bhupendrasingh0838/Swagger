package com.swag.Swagger.Demo.Model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Auto Genereted Book Id")
    private int bookId;
    @ApiModelProperty(value = "Book Name")
    private String bookName;
    @ApiModelProperty(value = "Price of the Book")
    private double price;


}
