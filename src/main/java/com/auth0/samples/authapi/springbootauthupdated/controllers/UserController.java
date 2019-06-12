package com.auth0.samples.authapi.springbootauthupdated.controllers;



//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import com.auth0.samples.authapi.springbootauthupdated.models.*;

//import com.auth0.samples.authapi.springbootauthupdated.repositories.*;

import com.auth0.samples.authapi.springbootauthupdated.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/users")

public class UserController {


    private UsersRepository usersRepository;

    private PasswordEncoder noOpPasswordEncoder;



    public UserController(UsersRepository usersRepository

                          , PasswordEncoder noOpPasswordEncoder) {

        this.usersRepository = usersRepository;

        this.noOpPasswordEncoder = noOpPasswordEncoder;

    }


    @GetMapping("/id")

    public ResponseEntity getId(@RequestParam String username){

        Long id=usersRepository.findByUsername(username).getId();
        return new ResponseEntity(id, HttpStatus.OK);

    }


    @GetMapping("/validate")

    public ResponseEntity validate(){

        return new ResponseEntity(HttpStatus.OK);

    }
}
