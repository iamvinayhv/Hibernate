package com.util;

import com.dao.UserDao;
import com.dto.User;

public class HebernateTest {

	public static void main(String[] args) {

		User user=new User();
		user.setId(2);
		user.setName("Suresh");
		user.setAge(20);
		
		UserDao dao=new UserDao();
		
		dao.saveUserData(user);
	}

}
