package com.bridgeLabz.ManyToOne.util;

import java.util.ArrayList;
import java.util.List;

import com.bridgeLabz.ManyToOne.dao.CountryDAO;
import com.bridgeLabz.ManyToOne.model.Country;
import com.bridgeLabz.ManyToOne.model.States;

public class Test5 {

	public static void main(String[] args) {
		
		List<States> arrStates = new ArrayList<States>();
		
		States s1 = new States();
		s1.setStateName("Karnataka");
		s1.setStateLanguage("Kannda");
		arrStates.add(s1);
		
		States s2 = new States();
		s2.setStateName("TamilNadu");
		s2.setStateLanguage("Tamil");
		arrStates.add(s2);
		
		States s3 = new States();
		s3.setStateLanguage("Thelugu");
		s3.setStateName("Andra Pradesh");
		arrStates.add(s3);
		
		Country country =new Country();
		country.setName("India");
		country.setCurrency("Rupee");
		country.setStates(arrStates);
		
		States states = new States();
		states.setCountry(country);
		
		
		
		CountryDAO dao =new CountryDAO();
		boolean result = dao.addCountry(states);
		if(result)
			System.out.println("Added");
		else
			System.out.println("not added");
		
	}
}
