package com.auth0.samples.authapi.springbootauthupdated;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.MessageDigestPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SpringbootAuthUpdatedApplication {

	@Bean
	public PasswordEncoder noOpPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	@Bean
	public PasswordEncoder md5Encoder()  {
		return new PasswordEncoder() {
			@Override
			public String encode(CharSequence charSequence) {
				return getMd5(charSequence.toString());
			}

			@Override
			public boolean matches(CharSequence charSequence, String s) {
				return getMd5(charSequence.toString()).equals(s);
			}
		};
	}

	public static String getMd5(String input) {
		try {
			// Static getInstance method is called with hashing SHA
			MessageDigest md = MessageDigest.getInstance("MD5");

			// digest() method called
			// to calculate message digest of an input
			// and return array of byte
			byte[] messageDigest = md.digest(input.getBytes());

			// Convert byte array into signum representation
			BigInteger no = new BigInteger(1, messageDigest);

			// Convert message digest into hex value
			String hashtext = no.toString(16);

			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}

			return hashtext;
		}

		// For specifying wrong message digest algorithms
		catch (NoSuchAlgorithmException e) {
			System.out.println("Exception thrown"
					+ " for incorrect algorithm: " + e);
			return null;
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAuthUpdatedApplication.class, args);
	}
}
