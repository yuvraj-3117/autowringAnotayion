package com.springcore.autowiredanotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired       //isse autometic inject hoga
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}
//@Autowired yaha bhi use kr skte h
	public void setAddress(Address address) {
		System.out.println("setter injecthing");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
		
	}
//@Autowired yaha bhi use kr skte he
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	

}
