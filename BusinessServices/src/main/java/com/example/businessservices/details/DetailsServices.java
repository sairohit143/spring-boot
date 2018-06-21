package com.example.businessservices.details;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class DetailsServices {
	
	 private List<Details> details = Arrays.asList(
			 new Details("120003255","rohit","cse"),
				new Details("120003194","dileep","cse"),
				new Details("120003069","chitti","cse")
			);
		 public List<Details> getAllTopics(){
			 return details;
		 }

}
