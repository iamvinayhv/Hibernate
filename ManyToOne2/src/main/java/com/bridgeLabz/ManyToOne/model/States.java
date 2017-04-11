package com.bridgeLabz.ManyToOne.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="ManyToOneStates_Info")
public class States {

	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	private int stateId;
	private String stateName;
	private String StateLanguage;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn
	private Country country;

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateLanguage() {
		return StateLanguage;
	}

	public void setStateLanguage(String stateLanguage) {
		StateLanguage = stateLanguage;
	}


}
