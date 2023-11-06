package com.sample.config;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

	@Bean
    PasswordEncoder getPasswordEncoder() {
        DelegatingPasswordEncoder encoder = (DelegatingPasswordEncoder) PasswordEncoderFactories.createDelegatingPasswordEncoder();
        encoder.setDefaultPasswordEncoderForMatches(new PasswordEncoder() {
            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                String base64Decoded = new String(Base64.getDecoder().decode(encodedPassword.getBytes()));
                return this.encode(rawPassword).equals(base64Decoded);
            }

            @Override
            public String encode(CharSequence rawPassword) {
                MessageDigest md = null;
                byte[] out = rawPassword.toString().getBytes();
                try {
                    md = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }

                if (md != null) {
                    md.reset();
                    md.update(rawPassword.toString().getBytes());
                    out = md.digest();
                }
                return new String(out);
            }
        });
        return encoder;
    }
}
