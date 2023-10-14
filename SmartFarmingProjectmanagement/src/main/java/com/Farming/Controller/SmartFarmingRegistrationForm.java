package com.Farming.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Farming.Service.UserService;
import com.Farming.entities.Users;

@RestController
@SpringBootApplication
public class SmartFarmingRegistrationForm {

	@Autowired
	UserService ss;

	@PostMapping("/registration")
	Users addUsers(@RequestBody Users user) {
		return ss.addUsers(user);
	}

	@GetMapping("/viewAllUsers")
	List<Users> viewAllUsers() {
		return ss.viewAllUsers();
	}

	@GetMapping("/viewUsersById/{id}")
	Users viewUsersById(@PathVariable int id) {
		return ss.viewUsersById(id);
	}

	@PutMapping("/updateUsers/{id}")
	Users updateUsers(@PathVariable int id, @RequestBody Users users) {
		return ss.updateusers(id, users);
	}

	@DeleteMapping("/deleteUsersById/{id}")

	Users deleteUsersById(@PathVariable int id) {
		return ss.viewUsersById(id);
	}

	@DeleteMapping("/deleteAllUsers")
	String deleteAllUsers() {
		return ss.deleteAlluser();
	}
}
