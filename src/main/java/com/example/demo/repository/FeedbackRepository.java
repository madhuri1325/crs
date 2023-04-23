package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Feedbacks;

public interface FeedbackRepository extends JpaRepository<Feedbacks, Integer> {

}