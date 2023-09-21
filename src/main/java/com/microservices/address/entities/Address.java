package com.microservices.address.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	
	@Id
//	@GeneratedValue(strategy= GenerationType.AUTO)
	private int emp_id;
	private int ad_id;
	private String ad_line1;
	private String ad_line2;
	private String zip;
	private String city;
	private String country;
	
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getAd_id() {
		return ad_id;
	}
	public void setAd_id(int ad_id) {

		this.ad_id = ad_id;
	}

	public String getAd_line1() {
		return ad_line1;
	}
	public void setAd_line1(String ad_line1) {
		this.ad_line1 = ad_line1;
	}
	
	public String getAd_line2() {
		return ad_line2;
	}
	public void setAd_line2(String ad_line2) {
		this.ad_line2 = ad_line2;
	}
	
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	
}
