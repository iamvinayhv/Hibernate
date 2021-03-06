package com.bridgelabz.hqldto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VIP_Humans")
public class Humans implements Serializable{

	@Override
	public String toString() {
		return "Humans [id=" + id + ", name=" + name + ", weight=" + weight + ", hight=" + hight + ", color=" + color
				+ "]";
	}

	@Id@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Weight")
	private double weight;
	@Column(name="Hight")
	private double hight;
	@Column(name="Color")
	private String color;
	
	public Humans() {
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
