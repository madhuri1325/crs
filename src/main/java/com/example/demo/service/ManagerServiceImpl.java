package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Complaints;
import com.example.demo.models.Managers;
import com.example.demo.repository.ComplaintRepository;
import com.example.demo.repository.ManagerRepository;

@Service
public class ManagerServiceImpl implements ManagerService {
	
	@Autowired
	ManagerRepository managerRepository;
	
	@Autowired
	ComplaintRepository complaintRepository;

//	@Override
//	public List<Managers> fetchAllManagers() {
//		return managerRepository.findAll();
//	}

	@Override
	public void saveManager(Managers manager) {
		managerRepository.save(manager);
		
	}

	@Override
	public Managers findManagerById(String email) {
		Managers manager = managerRepository.findById(email).orElse(null);
		return manager;
	}

	@Override
	public void deleteManager(Managers manager) {
		managerRepository.delete(manager);
		
	}

	@Override
	public Boolean validateManager(String managerEmail, String managerPassword) {
		System.out.println(managerEmail + " --- "+managerPassword);
		if (managerRepository.findById(managerEmail).isPresent()) {
			Managers manager= managerRepository.findById(managerEmail).get();
			String dbPassword = manager.getManagerPassword().toString();
			if (dbPassword.equals(managerPassword)) {
				return true;
			}
		}
		return false;
	}

	public List<Complaints> findComplaintByPincode(String managerPincode) {
		return complaintRepository.findComplaintByPincode(managerPincode);
	}

}