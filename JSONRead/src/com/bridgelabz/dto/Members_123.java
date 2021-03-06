package com.bridgelabz.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Members_Info")
public class Members_123 implements Serializable {

	
	@Column(name="Name")
	private String name;
	@Id
	@Column(name="Email")
	private String mail;
	@Column(name="City")
	private String city;
	@Column(name="Country")
	private String country;
	@Column(name="Phone_No")
	private String phone;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Members_123 [name=" + name + ", mail=" + mail + ", city=" + city + ", country=" + country
				+ ", phone=" + phone + "]";
	}
	
	
}
