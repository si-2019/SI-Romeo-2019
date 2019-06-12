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

    private PasswordEncoder md5Encoder;



    public UserController(UsersRepository usersRepository

                          ,PasswordEncoder noOpPasswordEncoder, PasswordEncoder md5Encoder) {

        this.usersRepository = usersRepository;

        this.noOpPasswordEncoder = noOpPasswordEncoder;

        this.md5Encoder = md5Encoder;
    }


    @GetMapping("/id")

    public ResponseEntity getId(@RequestParam String username){

        Korisnik korisnik=usersRepository.findByUsername(username);
        Long id = korisnik.getId();
        return new ResponseEntity(id, HttpStatus.OK);

    }


    @GetMapping("/validate")

    public ResponseEntity validate(){

        return new ResponseEntity(HttpStatus.OK);

    }
}
