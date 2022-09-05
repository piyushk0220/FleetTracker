package com.example.vehicle.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.vehicle.entity.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle,Integer>{
	
	public List<Vehicle> findAll();

}
