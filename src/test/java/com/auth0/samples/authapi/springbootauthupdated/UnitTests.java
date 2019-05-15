package com.auth0.samples.authapi.springbootauthupdated;
import com.auth0.samples.authapi.springbootauthupdated.User.UserDetails;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class UnitTests {
    @Test
    public void testValidUsername() throws Exception {
        /*Arrange*/
        UserDetails user=new UserDetails();
        /*Ac*/
        //boolean result = user.isValidUsername("[A-Za-z0-9]*");
        /*Assert*/
        //assertTrue("Valid username ID failed ", result );
    }
    @Test
    public void testInvalidUsername() throws Exception {

        UserDetails user=new UserDetails();
        user.setUsername("Neko");
        String name="Nekic";

        assertThat(name.equals(user.getUsername())).isFalse();
    }
    @Test
    public void testInvalidPassword() throws Exception {

       UserDetails user=new UserDetails();
       user.setPassword("NekoNekic123");
       String pass="Nekic";

       assertThat(pass.equals(user.getPassword())).isFalse();

    }
     @Test
    public void testValidPassword() throws Exception {

        UserDetails user=new UserDetails();
        user.setPassword("user123");
        String password= "user123";

        String trenutniPass=user.getPassword();

        assertThat(password.equals(trenutniPass)).isTrue();

    }
    
}