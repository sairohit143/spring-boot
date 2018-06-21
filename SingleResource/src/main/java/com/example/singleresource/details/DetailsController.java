package com.example.singleresource.details;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {
	
	@Autowired
	private DetailsServices detailsServices;
	
	@RequestMapping("/details")
	public List<Details> getAllTopics(){
		return detailsServices.getAllTopics();
	}
	
	@RequestMapping("/details/{name}")
	public Details getDetails(@PathVariable String name) {
	return detailsServices.getDetails(name);		
	}

}
