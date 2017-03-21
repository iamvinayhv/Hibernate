package com.bridgeLabz.hibrenate.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * This is a simple dto class wipth one default ctt and getter and setter.
 * @author bridgeit Vinay
 * @version 1.8
 * @since 2017-03-21
 *
 */
@Entity
@Table
public class NoteBook implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name="gen", strategy="increment")
	@GeneratedValue(generator="gen")
	private int id;
	private String name;
	private String brand;
	private double price;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Person person;
	
	public NoteBook() {
		System.out.println(this.getClass().getSimpleName()+" Created....");
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}