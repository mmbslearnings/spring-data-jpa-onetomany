/**
 * 
 */
package com.mobile.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author mmbsh
 *
 */

@Entity
public class Customer {
	
	@Id
	private int id;
	private String name;
	private long mobileNumber;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Customer(int id, String name, long mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
	}


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
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
