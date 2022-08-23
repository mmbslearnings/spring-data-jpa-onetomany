/**
 * 
 */
package com.mobile.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author mmbsh
 *
 */

@Entity
public class Mobile {
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="MODEL_NUM")
	private int modelNum;
	
	@OneToMany(targetEntity = Customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name="mc_fk", referencedColumnName = "id")
	private List<Customer> customers;
	
	
	public Mobile() {
	}
	
	public Mobile( int id,String name, int modelNum, List<Customer> customers) {
		super();
		this.id = id;
		this.name = name;		
		this.modelNum = modelNum;
		this.customers = customers;
	}
	
	public int getId() {
		return id;
	}

	public void setModelid(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getModelNum() {
		return modelNum;
	}
	
	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}

	public List<Customer> getCustomers() {
		return customers;
	}
	
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	

}
