package com.example.FleetTracker.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.FleetTracker.entity.Report;

public interface FleetRepository extends CrudRepository<Report,Integer> {
	
	public List<Report> findAll();

	

}
