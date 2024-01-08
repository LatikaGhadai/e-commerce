package com.jt.userlocation.service;

import java.util.List;

import com.jt.userlocation.entity.UserLocation;

public interface UserService {
	public UserLocation createUser(UserLocation user);
	public List<UserLocation> getAll();
	public UserLocation getUserById(int id);
	public void deleteUser(int id);
	public UserLocation updateUser(int id, UserLocation user);
}
