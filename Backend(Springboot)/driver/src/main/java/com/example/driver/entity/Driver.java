package com.example.driver.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="driver")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Driver {
	
	@Id
	private int id;
	private String name ;
	private String  doj;
	private String  condition;
	private String  runtime;
	private String  lastseen;
	private String  tstart;
	private String  tend;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getLastseen() {
		return lastseen;
	}
	public void setLastseen(String lastseen) {
		this.lastseen = lastseen;
	}
	public String getTstart() {
		return tstart;
	}
	public void setTstart(String tstart) {
		this.tstart = tstart;
	}
	public String getTend() {
		return tend;
	}
	public void setTend(String tend) {
		this.tend = tend;
	}
	public Driver(int id, String name, String doj, String condition, String runtime, String lastseen, String tstart,
			String tend) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
		this.condition = condition;
		this.runtime = runtime;
		this.lastseen = lastseen;
		this.tstart = tstart;
		this.tend = tend;
	}
	
	public Driver() {}

}
