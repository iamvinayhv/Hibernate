package com.bridgelabz.utilSave;

import com.bridgelabz.daohql.HumansDAO;

public class HumansDelete {

	public static void main(String[] args) {
		
		HumansDAO dao=new HumansDAO();
		dao.delete(3);

	}

}