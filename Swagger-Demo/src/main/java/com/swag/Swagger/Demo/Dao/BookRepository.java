package com.swag.Swagger.Demo.Dao;

import com.swag.Swagger.Demo.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
