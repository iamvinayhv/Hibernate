package com.bridgeLabz.OneToMany.util;

import java.util.ArrayList;

import com.bridgeLabz.OneToMany.dao.CountryDAO;
import com.bridgeLabz.OneToMany.model.Country;
import com.bridgeLabz.OneToMany.model.States;

public class Test4 {

	public static void main(String[] args) {
		
		Country country = new Country();
		country.setCountryName("India");
		country.setCurrency("Rupee");
		
		States states1 = new States();
		states1.setStateName("Karnataka");
		
		States states2 = new States();
		states2.setStateName("Maharastra");
		
		States states3 = new States();
		states3.setStateName("Punjab");
		
		States states4 = new States();
		states4.setStateName("Gujrath");
		
		ArrayList<States> arrAtates = new ArrayList<States>();
		arrAtates.add(states1);
		arrAtates.add(states2);
		arrAtates.add(states3);
		arrAtates.add(states4);
		
		country.setStates(arrAtates);
		
		CountryDAO dao = new CountryDAO();
		boolean result = dao.addCountry(country);

		if(result) {
			System.out.println("Added");
		}
		else {
			System.out.println("not added");
		}
		
	}
}
