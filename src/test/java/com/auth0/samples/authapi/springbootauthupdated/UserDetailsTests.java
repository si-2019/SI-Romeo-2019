package com.auth0.samples.authapi.springbootauthupdated;
import com.auth0.samples.authapi.springbootauthupdated.User.UserDetailsServiceImpl;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class UserDetailsTests {
    @Test
    public void testValidUsername() {
        UserDetailsServiceImpl user=new UserDetailsServiceImpl();
        user.setUsername("Merima");
        String name="Merima";

        assertThat(name.equals(user.getUsername())).isTrue();
    }
    @Test
    public void testInvalidUsername() {

        UserDetailsServiceImpl user=new UserDetailsServiceImpl();
        user.setUsername("Neko");
        String name="Nekic";

        assertThat(name.equals(user.getUsername())).isFalse();
    }
    @Test
    public void testInvalidPassword() {

       UserDetailsServiceImpl user=new UserDetailsServiceImpl();
       user.setPassword("NekoNekic123");
       String pass="Nekic";

       assertThat(pass.equals(user.getPassword())).isFalse();

    }
     @Test
    public void testValidPassword() {

        UserDetailsServiceImpl user=new UserDetailsServiceImpl();
        user.setPassword("user123");
        String password= "user123";

        String trenutniPass=user.getPassword();

        assertThat(password.equals(trenutniPass)).isTrue();

    }
    
}