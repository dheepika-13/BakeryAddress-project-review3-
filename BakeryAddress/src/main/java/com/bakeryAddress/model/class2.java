package com.bakeryAddress.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class class2 {
	@Id
	private long phoneno;
	private String cusname;
	private String city;
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
