package com.library.librarymanagmentsystem.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.librarymanagmentsystem.Entity.BookEntity;
import com.library.librarymanagmentsystem.Reposotries.BookRepostry;

@RestController
public class BookController {

    @Autowired
    BookRepostry bookRepostry;

    @GetMapping("/books/")
    public List<BookEntity> getBooks(){

        return bookRepostry.findAll();
    }

    @GetMapping("/books/{id}")
    public BookEntity getBookById(@PathVariable("id") int id){

        return bookRepostry.findById(id).get();
    }

    @PostMapping("/books/")
    public BookEntity createBook(@RequestBody BookEntity bookEntity){

        return bookRepostry.save(bookEntity);
    }

    @PutMapping("/books/")
    public BookEntity updateBook(@RequestBody BookEntity bookEntity){
         

        return bookRepostry.save(bookEntity);
    }


    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable("id") int id){
        bookRepostry.deleteById(id);

    }


}
