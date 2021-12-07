package com.swag.Swagger.Demo.Controller;

import com.swag.Swagger.Demo.Model.Book;
import com.swag.Swagger.Demo.Service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/book")
@Api(value = "Book Services",description = "Collection of Books")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/save")
    @ApiOperation(value = "This is the Save Book API")
    public String create(@RequestBody Book book){
        return bookService.create(book);
    }

    @GetMapping("/getAll")
    @ApiOperation(value = "This is the GetAll Book API")
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @GetMapping("getById/{bookId}")
    @ApiOperation(value = "This is the Book Get API by Id")
    public Book getById(@PathVariable int bookId){
        return bookService.getById(bookId);
    }

    @DeleteMapping("/delete/{bookId}")
    @ApiOperation(value = "This is the Delete Book API by Id")
    public List<Book> delete(@PathVariable int bookId){
        return bookService.delete(bookId);
    }

    @PutMapping("/update/{bookId}")
    @ApiOperation(value = "This is the Update Book API by Id")
    public Book update(@PathVariable int bookId,@RequestBody Book book){
        return bookService.update(bookId, book);
    }
}
