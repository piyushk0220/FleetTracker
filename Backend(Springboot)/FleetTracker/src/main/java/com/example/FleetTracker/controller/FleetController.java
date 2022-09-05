package com.example.FleetTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FleetTracker.entity.Report;
import com.example.FleetTracker.repository.FleetRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/report")
public class FleetController {
	
	@Autowired
	FleetRepository fleetRepository;
	
	@GetMapping("/gen_report")
	public List<Report> getReport() {
		List<Report> reportlist=fleetRepository.findAll();
		System.out.println(reportlist);
		return reportlist;
		
		
	}
	
}
