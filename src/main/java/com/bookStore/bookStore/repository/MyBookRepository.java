package com.bookStore.bookStore.repository;

import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,Integer>{

    List<MyBookList> findAllByOrderByNameAsc();

}
