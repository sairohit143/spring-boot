package com.example.restmapping.details;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * here restcontroller will return the details of student to localhost
 */
@RestController
public class DetailsController {
	
	/*
	 * here requestmapping will take deatails and give web request to from local host 
	 */
	@RequestMapping("/details")
	public List<Details> getALLTopics() {
	return Arrays.asList(
		new Details("120003255","rohit","cse"),
		new Details("120003194","dileep","cse"),
		new Details("120003069","chitti","cse")
	);
		
	}

}
