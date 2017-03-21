package com.bridgelabz.utilSave;

import com.bridgelabz.daohql.HumansDAO;
import com.bridgelabz.hqldto.Humans;

public class HumansSave {

	public static void main(String[] args) {

		Humans hum=new Humans();
		hum.setName("SpiderMan");
		hum.setHight(6);
		hum.setWeight(75);
		hum.setColor("RedBlue");
		
		HumansDAO dao=new HumansDAO();
		boolean result=dao.addData(hum);
		
		if(result)
		{
			System.out.println("Inserted into DB");
		}
		else {
			System.out.println("Not Inserted");
		}
	}

}
