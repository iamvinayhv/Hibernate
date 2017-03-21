package com.bridgelabz.utilSave;

import java.util.List;

import com.bridgelabz.daohql.HumansDAO;
import com.bridgelabz.hqldto.Humans;

public class HumansGetAll {

	public static void main(String[] args) {
		
		HumansDAO dao=new HumansDAO();
		List<Humans> humans=dao.getAll();

		for(Humans h:humans)
		{
			System.out.println(h);
		}
		
	}

}
