package com.example.driver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.driver.entity.Driver;
import com.example.driver.repository.DriverRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/driver")
public class DriverController {
	
	@Autowired
	DriverRepository driverRepository;
	
	@GetMapping("/details")
	public List<Driver> getDetails(){
		List<Driver> details = driverRepository.findAll();
		System.out.println(details);
		return details;
		
	}

}
