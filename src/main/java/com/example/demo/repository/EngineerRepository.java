package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Engineers;

public interface EngineerRepository extends JpaRepository<Engineers, String> {

}
