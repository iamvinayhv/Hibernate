package controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import dao.LoginDAO;
import model.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//User user=new User();
		String email=request.getParameter("mail");
		String password= request.getParameter("password");
		
		LoginDAO dao=new LoginDAO();
		
		
		User user = dao.login(email, password);
		
		System.out.println(user);
		
		if(user!=null) {
			
			RequestDispatcher rd=request.getRequestDispatcher("loginComplete.jsp");
			request.setAttribute("user", user);
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("loginError.jsp");
			rd.forward(request, response);
		}
		
	}

}
