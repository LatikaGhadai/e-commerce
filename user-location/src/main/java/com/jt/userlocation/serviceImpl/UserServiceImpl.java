package com.jt.userlocation.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.userlocation.entity.UserLocation;
import com.jt.userlocation.repo.UserRepository;
import com.jt.userlocation.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserLocation createUser(UserLocation user) {
		UserLocation saveUser =  userRepository.save(user);
		return saveUser;
	}
	
	@Override
	public List<UserLocation> getAll() {
		List<UserLocation> findAll = userRepository.findAll();
		return findAll;
	}

	@Override
	public UserLocation getUserById(int id) {
		
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserLocation updateUser(int id, UserLocation user) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
