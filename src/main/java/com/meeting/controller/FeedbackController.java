package com.meeting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meeting.model.Days;
import com.meeting.model.Feedback;
import com.meeting.repository.DayRepository;
import com.meeting.repository.FeedbackRepository;

@CrossOrigin(origins="http://localhost:8100")

@RestController
@RequestMapping(value="/rest")
public class FeedbackController {

	 @Autowired
	 private FeedbackRepository feedbackRepository;
	 
	 @RequestMapping(value = "/post-feedback", method = RequestMethod.POST)
		public Feedback postFeedback(@RequestBody Feedback feedback) {
//		 	Month m = new Month();
//		 	m.setMonth_exp_list(dayRepository.findAll());
//		 	monthRepository.save(m);

			return feedbackRepository.save(feedback);// return a object
		}
	 @RequestMapping(value = "/get-feedback", method = RequestMethod.GET)
		public List<Feedback> getFeedback() {
//		 	Month m = new Month();
//		 	m.setMonth_exp_list(dayRepository.findAll());
//		 	monthRepository.save(m);

			return feedbackRepository.findAll();
		}
}
