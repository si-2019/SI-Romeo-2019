package com.auth0.samples.authapi.springbootauthupdated;

import com.auth0.samples.authapi.springbootauthupdated.User.UserDetailsServiceImpl;
import com.auth0.samples.authapi.springbootauthupdated.models.Korisnik;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest
@AutoConfigureTestDatabase(replace = NONE)
public class UserDetailsServiceImplTests {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Test
    public void testValidloadUserByUsername() {
        String expected = new String("nnekic1");

        String actual = userDetailsService.loadUserByUsername("nnekic1").getUsername();

        assertThat(expected.equals(actual)).isTrue();


    }
}
