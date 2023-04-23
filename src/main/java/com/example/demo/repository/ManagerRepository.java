package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Complaints;
import com.example.demo.models.Managers;

public interface ManagerRepository extends CrudRepository<Managers, String> {

	

}