package com.hms.service;

import java.util.List;

import com.hms.entity.Bed;
import com.hms.entity.Ward;

public interface BedService {

	List<Bed> getAllBeds();

	Bed getBedById(int bedId);

	List<Bed> getBedsByWard(Ward ward);

	List<Bed> getUnoccupiedBeds();

}
