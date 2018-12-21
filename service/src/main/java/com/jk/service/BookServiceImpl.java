package com.jk.service;


import com.jk.model.Book;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{


    @Override
    @Async//声明此方法是一个异步run方法
    public void addBook(Book book) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("book = [" + book.toString() + "]");
    }
}
