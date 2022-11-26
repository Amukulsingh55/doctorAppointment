package com.doctor.services.impl;

import com.doctor.helper.UserFoundException;
import com.doctor.model.User;
import com.doctor.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
   private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

          User user=this.userRepository.findByUsername(username);
          if(user==null){
              System.out.println("User is not there!!!");
              try {
                  throw new UserFoundException("No user found in Database");
              } catch (UserFoundException e) {
                  throw new RuntimeException(e);
              }
          }else {
              return user;
          }



    }
}