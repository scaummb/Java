package srevletTest.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MVCTest extends HttpServlet {
		
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet()...MVCTest");
		UserJavaBean usb = new UserJavaBean();
		String xm = ""; String ps = ""; 
		xm = request.getParameter("username");
		ps = request.getParameter("password");
		usb.setPassword(ps);
		usb.setUsername(xm);
		HttpSession s = request.getSession(true);
		s.setAttribute("username", usb.getUsername());
//		response.sendRedirect("http:localhost:80\\my\\jsp\\main.jsp");
		response.sendRedirect("jsp\\main.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doPost()...MVCTest");
		doGet(req,resp);
	}
	

}
