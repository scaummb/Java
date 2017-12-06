package srevletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KeepMoving extends HttpServlet { 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("server...");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title></title></head><body>mmb you can do it</body></html>");
		out.print("<html><head><title></title></head><body>this is a doGet method</body></html>");
		out.flush();
		out.close();
	}
	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet..");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title></title></head><body>mmb you can do it</body></html>");
		out.print("<html><head><title></title></head><body>this is a doGet method</body></html>");
		out.flush();
		out.close();
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
//		PrintWriter out = resp.getWriter();
//		out.print("<html><head><title></title></head><body>this is a doPost method</body></html>");
//		out.flush();
//		out.close();
	}
	
	
}

