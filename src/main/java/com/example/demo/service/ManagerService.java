package com.example.demo.service;



import java.util.List;

import com.example.demo.models.Managers;

public interface ManagerService {

//	List <Managers> fetchAllManagers();
	void saveManager(Managers manager);
	Managers findManagerById(String email);
	void deleteManager(Managers manager);
	Boolean validateManager(String managerEmail, String managerPassword);
}