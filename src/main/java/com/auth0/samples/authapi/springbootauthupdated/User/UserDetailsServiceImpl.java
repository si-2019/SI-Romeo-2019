package com.auth0.samples.authapi.springbootauthupdated.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.auth0.samples.authapi.springbootauthupdated.models.Korisnik;
import com.auth0.samples.authapi.springbootauthupdated.repositories.UsersRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UsersRepository usersRepository;



    public UserDetailsServiceImpl(UsersRepository usersRepository) {

        this.usersRepository = usersRepository;

    }



    @Override

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Korisnik user = usersRepository.findByUsername(username);

        if (user == null) {

            throw new UsernameNotFoundException(username);

        }

        return new User(user.getUsername(), user.getPassword(), emptyList());

    }

}