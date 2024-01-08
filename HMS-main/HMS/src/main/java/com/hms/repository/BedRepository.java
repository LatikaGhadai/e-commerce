package com.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Bed;
import com.hms.entity.Ward;

public interface BedRepository extends JpaRepository<Bed, Integer> {

	List<Bed> findByWard(Ward ward);

	List<Bed> findByIsOccupied(boolean isOccupied);

}
