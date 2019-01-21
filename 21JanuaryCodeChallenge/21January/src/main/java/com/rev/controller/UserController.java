package com.rev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rev.beans.User;
import com.rev.service.AuthService;
import com.rev.service.UserService;

@RestController
@RequestMapping(value="/api")
public class UserController {

	private AuthService authorize;
	private UserService userService;
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Autowired
	public void setAutService(AuthService authService) {
		this.authorize = authService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<>(userService.findAllUser(),HttpStatus.OK);
	}
	@GetMapping("/byUser/{userId}")
	public ResponseEntity<List<User>> getAllUsersByRole(@PathVariable int userId){
		return new ResponseEntity<>(userService.findAllUsersByRole(userId), HttpStatus.OK);
	}
	@GetMapping("/byUsername/{username}")
	public ResponseEntity<User> getUserByName(@PathVariable String username){
		return new ResponseEntity<>(userService.findUser(username), HttpStatus.OK);
	}
	@GetMapping("/byID/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable int userId)
	{
		return new ResponseEntity<>(userService.findUserById(userId), HttpStatus.OK);
	}
	@PostMapping("/addUser")
	public ResponseEntity<String> addUser(@RequestBody User user) {

		ResponseEntity<String> resp = null;
		try {
			userService.addUser(user);
			resp = new ResponseEntity<>("USER CREATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE USER", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	@PutMapping("/updateUser")
	public ResponseEntity<String> updateUser(@RequestBody User user,@RequestParam String username){
		ResponseEntity<String> resp = null;
		try {
			userService.updateUser(username,user.getUsername(), user.getPassword());
			resp = new ResponseEntity<>("USER UPDATE SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO UPDATE USER", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	@DeleteMapping("/deleteUser")
	public ResponseEntity<String> removeUser(@RequestBody String username){
		ResponseEntity<String> resp = null;
		try {
			userService.removeUser(username);
			resp = new ResponseEntity<>("USER REMOVE SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO REMOVE USER", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	@PostMapping(value="/login",consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public String handleForm(@RequestBody MultiValueMap<String, String> formParams, Model m)
	{
		System.out.println("form params recieved: " + formParams);
		User cred = authorize.isValidUser(formParams.getFirst("login-username"),
				formParams.getFirst("login-password"));
		if (cred == null) {
			return "redirect:http://localhost:4200/login";
		} else {
			m.addAttribute("username", cred.getUsername());
			switch(cred.getUserRole().getName()) {
			case "Customer":
				return "redirect:http://localhost:4200/Home";
			case "Employee":
				return "redirect:http://localhost:4200/Ehome";
			case "Manager":
				return "redirect:http://localhost:4200/Mhome";
			}
		}
		return "redirect:http://localhost:4200/login";
	}
}
