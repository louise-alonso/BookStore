package com.bookStore.bookStore.controller;

import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.entity.MyBookList;
import com.bookStore.bookStore.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MyBookListController {

    @Autowired
    private MyBookListService service;

    @RequestMapping(value = "/deleteMyList/{id}", method = RequestMethod.GET)
    public String deleteMyList(@PathVariable("id") int id) {
        service.deleteById(id);
        return "redirect:/my_books";
    }

    @GetMapping("/mybooks_avaliable_books_in_order")
    public ModelAndView getAllBookInAlphabeticOrder(){
        List<MyBookList> list = service.getAllBookByName();


        return new ModelAndView("mybooks", "book", list);
    }
}
