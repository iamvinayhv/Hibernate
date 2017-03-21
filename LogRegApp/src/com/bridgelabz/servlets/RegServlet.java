package com.bridgelabz.servlets;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.bridgelabz.pojos.RegPojo;


public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RegPojo rp=new RegPojo();
		
		try {
			BeanUtils.populate(rp, request.getParameterMap());
		} 
		catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
