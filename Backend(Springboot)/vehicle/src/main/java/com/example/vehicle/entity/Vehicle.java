package com.example.vehicle.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle_info")
public class Vehicle {
	
	@Id
	private int Id;
	private String name;
	private String type;
	private String vin;
	private String lastSeen;
	private float distance;
	private String conditions;
	private float runtime;
	private long imei;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getLastSeen() {
		return lastSeen;
	}
	public void setLastSeen(String lastSeen) {
		this.lastSeen = lastSeen;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	public float getRuntime() {
		return runtime;
	}
	public void setRuntime(float runtime) {
		this.runtime = runtime;
	}
	public long getImei() {
		return imei;
	}
	public void setImei(long imei) {
		this.imei = imei;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Vehicle() {}
	public Vehicle(int id, String name, String type, String vin, String lastSeen, float distance, String conditions,
			float runtime, long imei) {
		
		Id = id;
		this.name = name;
		this.type = type;
		this.vin = vin;
		this.lastSeen = lastSeen;
		this.distance = distance;
		this.conditions = conditions;
		this.runtime = runtime;
		this.imei = imei;
	}
	
	
	
}