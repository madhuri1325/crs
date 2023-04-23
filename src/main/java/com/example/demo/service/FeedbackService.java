package com.example.demo.service;



import java.util.List;

import com.example.demo.models.Feedbacks;

public interface FeedbackService {
	List<Feedbacks> fetchAllFeedbacks();
	void saveFeedback (Feedbacks feedback);
	

}