package com.example.controller;


import com.example.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {


  @GetMapping("/message")
    Message send(){
        return new Message("hello World");
    }

    @PostMapping("/message")
    Message echo( @RequestBody Message message){
        return message;
    }

}
