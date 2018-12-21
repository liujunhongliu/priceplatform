package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.Book;
import com.jk.service.BookService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;


@Controller
public class BookController {

    /*@RabbitListener(queues = "myqueue")
    public void listenerBookMessage(String message){
        Map map = JSON.parseObject(message, Map.class);
        System.out.println("message = [" + map.toString() + "]");
    }*/
    @Autowired
    private BookService bookService;
    @RabbitListener(queues = "myqueue")
    public void listenerBookMessage(String message){
        Book book = JSON.parseObject(message, Book.class);
        //调用多线程处理新增业务逻辑
        bookService.addBook(book);
    }

}
