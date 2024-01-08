package com.hms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Medicine;
import com.hms.repository.MedicineRepository;
import com.hms.service.MedicineService;

@Service
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	private MedicineRepository medicineRepository;

	@Override
	public List<Medicine> getAllMedicines() {
		return medicineRepository.findAll();
	}

	@Override
	public Medicine getMedicineById(int medicineId) {
		return medicineRepository.findById(medicineId).orElse(null);
	}

	@Override
	public List<Medicine> getMedicinesByName(String medicineName) {
		return medicineRepository.findByMedicineName(medicineName);
	}

}
