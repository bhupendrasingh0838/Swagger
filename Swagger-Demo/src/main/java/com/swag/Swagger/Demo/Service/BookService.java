package com.swag.Swagger.Demo.Service;

import com.swag.Swagger.Demo.Dao.BookRepository;
import com.swag.Swagger.Demo.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public String create(Book book){
         bookRepository.save(book);
         return "Book save with ID "+ book.getBookId();
    }
    public List<Book> getAll(){
        return (List<Book>) bookRepository.findAll();
    }
    public Book getById(int bookId){
       // return bookRepository.findById(bookId).get();
        return bookRepository.findOne(bookId);
    }
    public List<Book> delete(int bookId){
       // bookRepository.deleteById(bookId);
        bookRepository.delete(bookId);
        return bookRepository.findAll();
    }
    public Book update(int bookId,Book book){
        Book book1 = bookRepository.findOne(bookId);
        book1.setBookName(book.getBookName());
        book1.setPrice(book.getPrice());
        bookRepository.save(book1);
        return book1;
    }
}
