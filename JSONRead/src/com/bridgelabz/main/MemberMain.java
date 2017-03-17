package com.bridgelabz.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.dao.MembersUpdate;
import com.bridgelabz.dto.Members_123;

public class MemberMain {

	public static void main(String[] args) {
		
		Members_123 mem=new Members_123();
		
		FileReader fr;
		JSONParser par=new JSONParser();
		
		try {
			fr = new FileReader("/home/bridgeit/vinay/JavaEclips/Hibernate/JSONRead/members.json");
			
			Object obj = par.parse(fr);
			
			JSONObject ob=(JSONObject)obj;
			
			MembersUpdate memUp =new MembersUpdate();
			
			JSONArray ja=(JSONArray) ob.get("members");
			
			for(int j=0 ; j<ja.size();j++)
			{
				JSONObject details=(JSONObject) ja.get(j);
				
				Object mailObj=details.get("mail");
				String mail= (String)mailObj;
				mem.setMail(mail);
				
				
				Object nameObj=details.get("name");
				String name=(String)nameObj;
				mem.setName(name);
				
				
				Object cityObj=details.get("city");
				String city=(String)cityObj;
				mem.setCity(city);
				
				
				Object countryObj=details.get("country");
				String country=(String)countryObj;
				mem.setCountry(country);
				
				
				Object phoneObj=details.get("phone");
				String phone=(String)phoneObj;
				mem.setPhone(phone);
				
				memUp.save(mem);
				
			}
			
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
	
