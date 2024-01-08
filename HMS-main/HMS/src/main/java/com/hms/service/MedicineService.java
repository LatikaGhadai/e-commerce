package com.hms.service;

import java.util.List;

import com.hms.entity.Medicine;

public interface MedicineService {

	List<Medicine> getAllMedicines();

	Medicine getMedicineById(int medicineId);

	List<Medicine> getMedicinesByName(String medicineName);

}
