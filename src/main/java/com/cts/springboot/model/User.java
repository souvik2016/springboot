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
	  private String phoneType;
	  private String phoneNo;
	  private String mailingAddress;
	  private String taxIdNo;
	  private String primaryIdType;
	  private String primaryIdNo;

	public User(String loginId, String password, String confirmPassword,
			String name, String email, String phoneType, String phoneNo,
			String mailingAddress, String taxIdNo, String primaryIdType,
			String primaryIdNo) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.name = name;
		this.email = email;
		this.phoneType = phoneType;
		this.phoneNo = phoneNo;
		this.mailingAddress = mailingAddress;
		this.taxIdNo = taxIdNo;
		this.primaryIdType = primaryIdType;
		this.primaryIdNo = primaryIdNo;
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

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getTaxIdNo() {
		return taxIdNo;
	}

	public void setTaxIdNo(String taxIdNo) {
		this.taxIdNo = taxIdNo;
	}

	public String getPrimaryIdType() {
		return primaryIdType;
	}

	public void setPrimaryIdType(String primaryIdType) {
		this.primaryIdType = primaryIdType;
	}

	public String getPrimaryIdNo() {
		return primaryIdNo;
	}

	public void setPrimaryIdNo(String primaryIdNo) {
		this.primaryIdNo = primaryIdNo;
	}
	
}
