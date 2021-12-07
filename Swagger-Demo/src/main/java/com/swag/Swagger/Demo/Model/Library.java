package com.swag.Swagger.Demo.Model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Auto Generated Library Id")
    private int lib_id;
    @ApiModelProperty(value = "Book Name")
    private String libName;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Book> books;


}
