package com.example.demo.controllers;

import com.example.demo.services.LoginService;
import com.example.demo.models.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class LoginController {
//    private final LoginService loginService;
//    @Autowired
//    public LoginController(LoginService loginService) {
//        this.loginService = loginService;
//    }
    @GetMapping
    public String home(){
        return "Hello World!";
    }
//    @GetMapping("/login")
//    public List<Login> getLogin(){
//        return loginService.getLogin();
//    }
/*
    @PostMapping("/blog/search")
    public List<Login> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        return loginRespository.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
    }

    @PostMapping("/blog")
    public Login create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String content = body.get("content");
        return loginRespository.save(new Login(title, content));
    }
*/


}
