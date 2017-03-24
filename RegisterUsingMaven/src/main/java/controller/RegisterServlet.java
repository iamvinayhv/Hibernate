package controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import dao.LoginDAO;
import dao.RegisterDAO;
import model.User;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user=new User();
		
		try {
			BeanUtils.populate(user, request.getParameterMap());
			
			System.out.println(user.getName());
			
			LoginDAO daol=new LoginDAO();
			
				
				RegisterDAO dao=new RegisterDAO();
				boolean isReg=dao.saveData(user);
				if(isReg)
				{
					RequestDispatcher rd=request.getRequestDispatcher("regComplete.jsp");
					rd.forward(request, response);
				}
				else{
					RequestDispatcher rd=request.getRequestDispatcher("alreadyReg.jsp");
					rd.forward(request, response);
					
				}
			
			
			
			
			
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		
	}

}
