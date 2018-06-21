package com.wavelabs.curd.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wavelabs.curd.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
	    List<Customer> findByLastName(String lastName);

		//Object findOne(long id);
	}


