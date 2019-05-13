package com.auth0.samples.authapi.springbootauthupdated;
import org.junit.Test;
import java.util.Map;
import static org.junit.Assert.*;


public class UserDetailsTest {
    @Test
    public void testValidUsername() throws Exception {
        /*Arrange*/
        UserDetail user=new UserDetails());
        /*Act*/
        boolean result = user.isValidUsername("[A-Za-z0-9]*");
        /*Assert*/
        assertTrue("Valid username ID failed ", result );
    }
    @Test
    public void testInvalidUsername() throws Exception {
        /*Arrange*/
        UserDetails user=new UserDetails();
        /*Act*/
        boolean result= user.isValidUsername("[A-Za-z0-9]*");
        /*Assert*/
        assertFalse("Invalid username ID passed ", result);
    }
    @Test
    public void testInvalidPassword() throws Exception {
        /*Arrange*/
       UserDetails user=new UserDetails();
        /*Act*/
        boolean result= user.isValidPassword("[A-Za-z0-9]*{8,}");
        /*Assert*/
        assertFalse("Invalid Password passed ", result);
    }
     @Test
    public void testValidPassword() throws Exception {
        /*Arrange*/
        UserDetail user=new UserDetails());
        /*Act*/
        boolean result = user.isValidPassword("[A-Za-z0-9]*{8,}");
        /*Assert*/
        assertTrue("Valid Password failed ", result );
    }

    @Test
    public void testInvalidID() throws Exception {
        /*Arrange*/
       UserDetails user=new UserDetails();
        /*Act*/
        boolean result= user.isValidID("[0-9A-Z]*");
        /*Assert*/
        assertFalse("Invalid ID passed ", result);
    }

    @Test
    public void testValidID() throws Exception {
        /*Arrange*/
       UserDetails user=new UserDetails();
        /*Act*/
        boolean result= user.isValidID("[0-9]*");
        /*Assert*/
        assertFalse("Valid ID passed ", result);
    }
    
}