package com.cts.springboot.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.springboot.model.User;
import com.cts.springboot.repository.LoginRepository;

@RestController
@RequestMapping("/user")
public class LoginController {

	@Autowired
	LoginRepository loginRepo;
	
	@RequestMapping(method = RequestMethod.POST, value="/registration")
	  public Map<String, Object> createUser(@RequestBody Map<String, Object> userMap){
	    User book = new User(userMap.get("loginId").toString(),
	    		userMap.get("password").toString(),
	    		userMap.get("confirmPassword").toString(),
	    		userMap.get("name").toString(),
	    		userMap.get("email").toString(),
	    		userMap.get("phoneType").toString(),
	    		userMap.get("phoneNo").toString(),
	    		userMap.get("mailingAddress").toString(),
	    		userMap.get("taxIdNo").toString(),
	    		userMap.get("primaryIdType").toString(),
	    		userMap.get("primaryIdNo").toString());
	    System.out.println("login id:::::"+userMap.get("loginId").toString());
	    Map<String, Object> response = new LinkedHashMap<String, Object>();
	    if(userMap.get("password").toString().equals(userMap.get("confirmPassword").toString())){
	    	loginRepo.save(book);
	    	response.put("message", "User created successfully");
		    response.put("User", book);
	    } else{
	    	response.put("error", "Confirm password doesn't match");
	    }    
	    return response;
	  }

	  @RequestMapping(method = RequestMethod.POST, value="/login")
	  public void getUserDetails(@RequestBody String loginId){
		  System.out.println("loginID::::"+loginId);
		  User user = loginRepo.findByLoginId(loginId);
	    /*return user.getPassword();*/
	  }
}
