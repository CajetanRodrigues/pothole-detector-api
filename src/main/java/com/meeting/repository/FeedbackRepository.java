package com.meeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meeting.model.Feedback;

public interface FeedbackRepository  extends JpaRepository<Feedback, Integer> {

}
