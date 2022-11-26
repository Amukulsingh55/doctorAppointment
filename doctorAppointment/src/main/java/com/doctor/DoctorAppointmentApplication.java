package com.doctor;


import com.doctor.helper.UserFoundException;
import com.doctor.model.Role;
import com.doctor.model.User;
import com.doctor.model.UserRole;
import com.doctor.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DoctorAppointmentApplication implements CommandLineRunner {
    @Autowired
	private UserService userService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(DoctorAppointmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");
//		try {
//			User user = new User();
//			user.setFirstName("Mukul");
//			user.setLastName("Singh");
//			user.setUsername("mukul1997");
//			user.setPassword(this.bCryptPasswordEncoder.encode("Mukul1030289"));
//			user.setEmail("mukul@gmail.com");
//			user.setProfile("default.png");
//
//			Role role1 = new Role();
//			role1.setRoleId(44L);
//			role1.setRoleName("ADMIN");
//
//			Set<UserRole> userRoleSet = new HashSet<>();
//			UserRole userRole = new UserRole();
//			userRole.setRole(role1);
//			userRole.setUser(user);
//
//			userRoleSet.add(userRole);
//
//			User user1 = this.userService.createUser(user, userRoleSet);
//			System.out.println(user1.getUsername());
//		}catch (UserFoundException e){
//			e.printStackTrace();
//		}

	}
}

