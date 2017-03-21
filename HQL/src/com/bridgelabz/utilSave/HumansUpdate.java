package com.bridgelabz.utilSave;

import com.bridgelabz.daohql.HumansDAO;

public class HumansUpdate {

	public static void main(String[] args) {
		
		HumansDAO dao=new HumansDAO();
		
		dao.update(1, "Hulk");

	}

}
