package com.auth0.samples.authapi.springbootauthupdated;
import com.auth0.samples.authapi.springbootauthupdated.User.UserDetailsServiceImpl;
import com.auth0.samples.authapi.springbootauthupdated.models.Korisnik;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class KorisnikTests {
    @Test
    public void testValidUsername() {
        Korisnik user=new Korisnik();
        user.setUsername("Merima");
        String name="Merima";

        assertThat(name.equals(user.getUsername())).isTrue();
    }
    @Test
    public void testInvalidUsername() {

        Korisnik user=new Korisnik();
        user.setUsername("Neko");
        String name="Nekic";

        assertThat(name.equals(user.getUsername())).isFalse();
    }
    @Test
    public void testInvalidPassword() {

       Korisnik user=new Korisnik();
       user.setPassword("NekoNekic123");
       String pass="Nekic";

       assertThat(pass.equals(user.getPassword())).isFalse();

    }
     @Test
    public void testValidPassword() {

        Korisnik user=new Korisnik();
        user.setPassword("user123");
        String password= "user123";

        String trenutniPass=user.getPassword();

        assertThat(password.equals(trenutniPass)).isTrue();

    }
    
}