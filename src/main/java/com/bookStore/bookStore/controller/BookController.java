package com.bookStore.bookStore.controller;

import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.entity.MyBookList;
import com.bookStore.bookStore.servicefachada.BookServiceFachada;
import com.bookStore.bookStore.service.MyBookListService;

import com.bookStore.bookStore.servicefachada.BookServiceFachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class BookController {

    @Autowired
    private BookServiceFachada service;

    @Autowired
    private MyBookListService myBookService;

    @GetMapping("/")
    public String home() {
        return "home"; // Retorna a página inicial
    }

    @GetMapping("/book_register")
    public String bookRegister() {
        return "bookRegister"; // Retorna a página para registrar um novo livro
    }

    @GetMapping("/available_books")
    public ModelAndView getAllBook() {
        List<Book> list = service.getAllBook();
        return new ModelAndView("bookList", "book", list); // Retorna a lista de todos os livros disponíveis
    }

    @GetMapping("/avaliable_books_in_order")
    public ModelAndView getAllBookInAlphabeticOrder() {
        List<Book> list = service.getAllBookByName();
        return new ModelAndView("bookList", "book", list); // Retorna a lista de todos os livros disponíveis em ordem alfabética
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b) {
        service.save(b);
        return "redirect:/available_books"; // Adiciona um novo livro e redireciona para a lista de livros disponíveis
    }

    @GetMapping("/my_books")
    public String getMyBooks(Model model) {
        List<MyBookList> list = myBookService.getAllMyBooks();
        model.addAttribute("book", list);
        return "myBooks"; // Retorna a lista de livros do usuário
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id) {
        Book b = service.getBookById(id);
        MyBookList mb = new MyBookList(b.getId(), b.getName(), b.getAuthor(), b.getPrice(), b.getGenre(), b.getYear(), b.getPages()); // Convertendo ano e páginas para strings
        myBookService.saveMyBooks(mb);
        return "redirect:/my_books"; // Adiciona um livro à lista do usuário e redireciona para a
    }

        @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") int id, Model model) {
        Book b = service.getBookById(id);
        model.addAttribute("book", b);
        return "bookEdit"; // Retorna a página para editar informações de um livro
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        service.deleteById(id);
        return "redirect:/available_books"; // Deleta um livro e redireciona para a lista de livros disponíveis
    }

}