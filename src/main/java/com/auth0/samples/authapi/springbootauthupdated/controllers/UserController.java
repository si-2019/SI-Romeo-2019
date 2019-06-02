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


    /*@GetMapping("/id")

    public ResponseEntity getId(@RequestParam String username){

        return new ResponseEntity(usersRepository.findByUsername(username), HttpStatus.OK);

    }



    /*@GetMapping("/all")

    public ResponseEntity getUsers(){

        return new ResponseEntity(usersRepository.findAll(), HttpStatus.OK);

    }



    /*@PostMapping("/register")

    public ResponseEntity register(@RequestBody UserDTO userDTO) {



        Users existingUser = usersRepository.findByEmail(userDTO.getEmail());

        if(existingUser!=null){

            return new ResponseEntity(HttpStatus.BAD_REQUEST);

        }

        else {

            Users user = new Users();

            user.setName(userDTO.getName());

            user.setLastName(userDTO.getLastName());

            user.setEmail(userDTO.getEmail());

            user.setPhoneNumber(userDTO.getPhoneNumber());

            user.setPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()));



            System.out.println(userDTO.getCity() + userDTO.getCountry());

            City city = cityDao.getCity(userDTO.getCity(), userDTO.getCountry());

            user.setCity(city);

            user.setCountry(city.getCountry());

            userDao.save(user);

            return new ResponseEntity(user, HttpStatus.OK);

        }

    }
*/
}
