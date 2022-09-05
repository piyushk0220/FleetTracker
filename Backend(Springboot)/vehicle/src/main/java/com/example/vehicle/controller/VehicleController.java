package com.example.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehicle.entity.Vehicle;
import com.example.vehicle.repository.VehicleRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	@GetMapping("/details")
	public List<Vehicle> getVehicle(){
		List<Vehicle> vehicleList = vehicleRepository.findAll();
		System.out.println(vehicleList);
		return vehicleList;
		
	}

}
