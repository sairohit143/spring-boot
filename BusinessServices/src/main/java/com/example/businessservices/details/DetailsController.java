package com.example.businessservices.details;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {
	
	@Autowired
	private DetailsServices detailsservices;
	
	@RequestMapping("/details")
	public List<Details> getAllTopics(){
		return detailsservices.getAllTopics();
		
	}

}
