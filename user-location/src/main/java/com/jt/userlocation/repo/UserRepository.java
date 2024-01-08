package com.jt.userlocation.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jt.userlocation.entity.UserLocation;

public interface UserRepository extends JpaRepository<UserLocation,Integer>{
	
}
