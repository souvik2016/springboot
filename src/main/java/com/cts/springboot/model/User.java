package com.cts.springboot.model;

import org.springframework.data.annotation.Id;

public class User {

	 @Id
	  private String id;
	  private String loginId;
	  private String password;
	  private String confirmPassword;
	  private String name;
	  private String email;
	  
	public User(String loginId, String password,
			String confirmPassword, String name, String email) {
		this.loginId = loginId;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.name = name;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
