package com.bookStore.bookStore.servicefachada;

import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceFachada {

    @Autowired
    private BookService bookService;
    public void save(Book b){
        bookService.save(b);
    }

    public List<Book> getAllBook(){
       return bookService.getAllBook();
    }

    public List<Book> getAllBookByName(){
        return bookService.getAllBookByName();
    }

    public Book getBookById(int id){
        return bookService.getBookById(id);
    }

    public void deleteById(int id){
        bookService.deleteById(id);
    }
}
