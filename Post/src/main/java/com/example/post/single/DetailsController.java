package com.example.post.single;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {
	
	@Autowired
	private DetailsServices detailsService;
	
	@RequestMapping("/details")
	public List<Details> getAllTopics(){
		return detailsService.getAllTopics();
	}
	
	@RequestMapping("/details/{id}")
	public Details getDetails(@PathVariable String id) {
		return detailsService.getDetails(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/details")
	public void addDetails(@RequestBody Details detail) {
		detailsService.adddetails(detail);
		
	}

}
