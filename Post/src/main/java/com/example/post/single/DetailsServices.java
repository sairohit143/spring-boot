package com.example.post.single;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DetailsServices {
	
	private List<Details> details= new ArrayList<>(Arrays.asList(
			new Details("120003255","rohit","cse"),
			new Details("120003194","dhileep","cse"),
			new Details("120003069","chitti","cse")
			));
	public List<Details> getAllTopics(){
		return details;
	}
	
	public Details getDetails(String id) {
    return details.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void adddetails(Details detail) {
		details.add(detail);
	}
	
}
