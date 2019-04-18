package com.auth0.samples.authapi.springbootauthupdated.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDetails{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private long id;
    private String username;
    private String password;

    public long getID() {
        return id;
    }
}