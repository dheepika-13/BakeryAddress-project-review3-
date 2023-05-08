package com.bakeryAddress.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class class1 {
	@Id
	private int cusid;
	private String cusname;
	private String country;
	private String address;
	
	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="phoneno")
	private class2 bake;
	
	public class2 getBake() {
		return bake;
	}
	public void setBake(class2 bake) {
		this.bake = bake;
	}
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
}