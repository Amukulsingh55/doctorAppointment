package com.doctor.services;

import org.springframework.stereotype.Service;


import com.doctor.model.User;
import com.doctor.model.UserRole;

import java.util.Set;

public interface UserService {
    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
    //get user by user name
    public User getUser(String username);
    //delete user by id
    public void deleteUser(Long userId);
}

