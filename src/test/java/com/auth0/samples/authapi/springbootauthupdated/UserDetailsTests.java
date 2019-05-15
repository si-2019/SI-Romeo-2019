package com.auth0.samples.authapi.springbootauthupdated;
import com.auth0.samples.authapi.springbootauthupdated.User.UserDetails;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class UserDetailsTests {
    @Test
    public void testValidUsername() {
        UserDetails user=new UserDetails();
        user.setUsername("Merima");
        String name="Merima";

        assertThat(name.equals(user.getUsername())).isTrue();
    }
    @Test
    public void testInvalidUsername() {

        UserDetails user=new UserDetails();
        user.setUsername("Neko");
        String name="Nekic";

        assertThat(name.equals(user.getUsername())).isFalse();
    }
    @Test
    public void testInvalidPassword() {

       UserDetails user=new UserDetails();
       user.setPassword("NekoNekic123");
       String pass="Nekic";

       assertThat(pass.equals(user.getPassword())).isFalse();

    }
     @Test
    public void testValidPassword() {

        UserDetails user=new UserDetails();
        user.setPassword("user123");
        String password= "user123";

        String trenutniPass=user.getPassword();

        assertThat(password.equals(trenutniPass)).isTrue();

    }
    
}