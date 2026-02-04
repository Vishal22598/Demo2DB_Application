package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.db1.entity.User;
import com.demo.db1.repo.UserRepository;
import com.demo.db2.entity.AuditLog;
import com.demo.db2.repo.AuditRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository userRepo;
	private final AuditRepository auditRepo;
	
	public void createUser(String name) {
		User user = new User();
		user.setName(name);
		userRepo.save(user); //DB1
		
		AuditLog log = new AuditLog();
		log.setAction("User created: " + name);
		auditRepo.save(log);  //DB2
	}
}
