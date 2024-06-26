package com.first.cardatabase.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.first.cardatabase.domain.User;
import com.first.cardatabase.domain.UserRepository;

@Service
public class UserDetailsServicesImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepo.findByUsername(username);
        if (user.isPresent()) {
            var instanceUser = user.get();
            var builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.password(instanceUser.getPassword());
            builder.roles(instanceUser.getRole());
            return builder.build();
        } else {
            throw new UsernameNotFoundException("User name not found ");
        }

    }

}