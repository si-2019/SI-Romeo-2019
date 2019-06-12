package com.auth0.samples.authapi.springbootauthupdated.security;

public class SecurityConstants {
    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 900_000; // 15 min
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String LOGIN_URL = "/auth/login";
    public static final String LOGIN_ID = "/users/id";
}
