package com.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Ward;

public interface WardRepository extends JpaRepository<Ward, Integer>{
	
	 List<Ward> findByWardName(String wardName);

}
