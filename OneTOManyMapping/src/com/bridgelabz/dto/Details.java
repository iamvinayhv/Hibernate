package com.bridgelabz.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Details of the Employee
 * @author vinay
 * @since 2017-03-22
 *
 */
@Entity
@Table(name="One_Many_Details_Emp")
public class Details implements Serializable {

	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	@Column(name="ID")
	private int Id;
	@Column(name="Phone")
	private long phone;
	@Column(name="Mobile")
	private long mobile;
	
	

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
}
