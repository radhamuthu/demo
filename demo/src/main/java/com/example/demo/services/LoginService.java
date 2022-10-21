package com.example.demo.services;

import com.example.demo.models.Login;
import com.example.demo.repositories.LoginRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginService {
 private final LoginRespository loginRespository;


    @Autowired
    public LoginService(LoginRespository loginRespository) {
        this.loginRespository = loginRespository;
    }
    public List<Login> getLogin() {

       return (List.of(new Login(1,"radha","do it")));
    }
}
