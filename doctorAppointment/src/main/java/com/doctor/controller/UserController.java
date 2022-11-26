package com.doctor.controller;

import com.doctor.helper.UserFoundException;
import com.doctor.helper.UserNotFoundExeception;
import com.doctor.model.Role;
import com.doctor.model.User;
import com.doctor.model.UserRole;
import com.doctor.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    //creating user
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {
        user.setProfile("default.png");
        //encoding password with bcrypt
        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));


        Set<UserRole> roles = new HashSet<>();

        Role role = new Role();
        role.setRoleId(45L);
        role.setRoleName("NORMAL");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        roles.add(userRole);
        return this.userService.createUser(user, roles);

    }
      //get user by username
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return  this.userService.getUser(username);
    }
    //delete the  user by id
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
              this.userService.deleteUser(userId);
    }
//   //update user by id
//    @PutMapping("/{userId}")
//    public User updateUser() {
//    	
//    }

//    @ExceptionHandler(UserFoundException.class)
//    public ResponseEntity<?> exceptionHandler(UserFoundException userFoundException){
//      return ResponseEntity.of(UserFoundException());
//    }
}
