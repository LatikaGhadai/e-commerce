package com.hms.service;

import java.util.List;

import com.hms.entity.Ward;

public interface WardService {

	List<Ward> getAllWards();

	Ward getWardById(int wardId);

	List<Ward> getWardsByName(String wardName);

}
