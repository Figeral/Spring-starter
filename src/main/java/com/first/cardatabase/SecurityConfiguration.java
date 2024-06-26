package com.first.cardatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.first.cardatabase.service.*;;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
    @Autowired
    UserDetailsServicesImpl UserDetailsServicesImpl;

    @Autowired
    public void GlobalConfig(AuthenticationManagerBuilder auth) throws Exception {
        try {
            auth.userDetailsService(UserDetailsServicesImpl).passwordEncoder(new BCryptPasswordEncoder());
        } catch (Exception e) {
            System.err.println((e.getMessage()));
        }
    }
}
