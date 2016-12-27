package com.cts.springboot.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cts.springboot.model.User;

public interface LoginRepository extends MongoRepository<User, String> {

	public User findByLoginId(String loginId);
}
