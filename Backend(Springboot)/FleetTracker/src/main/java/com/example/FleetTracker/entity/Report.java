package com.example.FleetTracker.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Report")
public class Report {
	
	@Id
	private int Id;
	private int Tenants;
	private int Fleets;
	private int Devices;
	private int Vehicles;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getTenants() {
		return Tenants;
	}
	public void setTenants(int tenants) {
		Tenants = tenants;
	}
	public int getFleets() {
		return Fleets;
	}
	public void setFleets(int fleets) {
		Fleets = fleets;
	}
	public int getDevices() {
		return Devices;
	}
	public void setDevices(int devices) {
		Devices = devices;
	}
	public int getVehicles() {
		return Vehicles;
	}
	public void setVehicles(int vehicles) {
		Vehicles = vehicles;
	}
	
	public Report() {}
	
	public Report(int id, int tenants, int fleets, int devices, int vehicles) {
		super();
		Id = id;
		Tenants = tenants;
		Fleets = fleets;
		Devices = devices;
		Vehicles = vehicles;
	}
	
	
	
	
	

}
