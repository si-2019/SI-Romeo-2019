package com.auth0.samples.authapi.springbootauthupdated.repositories;


import com.auth0.samples.authapi.springbootauthupdated.models.Korisnik;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Korisnik, Long> {

    Korisnik findByUsername(String username);



}


