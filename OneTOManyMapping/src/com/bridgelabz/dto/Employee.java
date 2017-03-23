package com.bridgelabz.dto;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * One to many Mapping
 * @author vinay
 * @since 2017-03-21
 *
 */
@Entity
@Table(name="One_Many_Employee_Info")
public class Employee implements Serializable{
	
	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	@Column(name="ID")
	private int id;
	@Column(name="Name")
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="pk_ID")
	private Collection<Details>details;

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

	public Collection<Details> getDetails() {
		return details;
	}

	public void setDetails(Collection<Details> details) {
		this.details = details;
	}
}
