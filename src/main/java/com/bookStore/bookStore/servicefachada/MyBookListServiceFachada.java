package com.bookStore.bookStore.servicefachada;

import com.bookStore.bookStore.entity.MyBookList;
import com.bookStore.bookStore.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyBookListServiceFachada {

    @Autowired
    private MyBookListService service;

    public void saveMyBooks(MyBookList book){
        service.saveMyBooks(book);
    }

    public List<MyBookList> getAllBookByName(){
        return service.getAllBookByName();
    }

    public List<MyBookList> getAllMyBooks(){
        return service.getAllMyBooks();
    }

    public void deleteById(int id){
        service.deleteById(id);
    }
}
