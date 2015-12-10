package com.news.model;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

public class Address implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer Address_Id;
	private String Address_Name;
	private int Address_Level = 1;
	private Set<Address> children;
	private Address parent;
	

	public Set<Address> getChildren() {
		return children;
	}

	public void setChildren(Set<Address> children) {
		this.children = children;
	}

	public Address getParent() {
		return parent;
	}

	public void setParent(Address parent) {
		this.parent = parent;
	}
	
	public int getAddress_Level() {
		return Address_Level;
	}

	public void setAddress_Level(int address_Level) {
		Address_Level = address_Level;
	}

	public Integer getAddress_Id() {
		return Address_Id;
	}

	public void setAddress_Id(Integer address_Id) {
		Address_Id = address_Id;
	}

	public String getAddress_Name() {
		return Address_Name;
	}

	public void setAddress_Name(String address_Name) {
		Address_Name = address_Name;
	}

}
