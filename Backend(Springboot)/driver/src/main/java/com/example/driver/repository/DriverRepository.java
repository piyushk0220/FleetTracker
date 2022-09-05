package com.example.driver.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.driver.entity.Driver;

public interface DriverRepository extends CrudRepository<Driver,Long> {
	
	public List<Driver> findAll();

}
