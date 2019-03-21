package com.meeting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meeting.model.Feedback;
import com.meeting.model.Meeting;
import com.meeting.model.Pothole;
import com.meeting.repository.PotholeRepository;

@CrossOrigin(origins="http://localhost:8100")

@RestController
@RequestMapping(value="/rest")
public class PotholeController {

	 @Autowired
	 private PotholeRepository potholeRepository;
	 
	 @RequestMapping(value = "/post-pothole", method = RequestMethod.POST)
		public Pothole postPothole(@RequestBody Pothole pothole) {


			return potholeRepository.save(pothole);// return a object
		}
	 @RequestMapping(value = "/get-pothole", method = RequestMethod.GET)
		public List<Pothole> getPothole() {


			return potholeRepository.findAll();
		}
	 @DeleteMapping("/pothole/{id}")
		public void deletePothole(@PathVariable("id") int id) {
		 potholeRepository.deleteById(id);
		}
	 @PutMapping("/pothole/{id}")
		public Pothole updatePothole(@PathVariable("id") int id, @RequestBody Pothole pothole) {
			//go to repo and fetch existing meeting based on id
			Pothole p = potholeRepository.getOne(id);
			p.setImage(pothole.getImage());
			return potholeRepository.save(p);
			
		}
}
