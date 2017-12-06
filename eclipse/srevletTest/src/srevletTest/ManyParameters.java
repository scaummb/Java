package srevletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ManyParameters extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("utf-8");
		//out 是响应的职责，resp是响应。
		PrintWriter out = resp.getWriter();
		//获取参数变量是从请求处获得的。
		out.println(req.getParameter("param1"));
		//html标签<br>：换行
		out.print("<br>");
		out.println(req.getParameter("param2"));
		out.print("<br>");
		out.println(req.getParameter("param3"));
		out.print("<br>");
		System.out.println("in doGet..");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("in doPost..");
		doGet(req,resp);
	}
	
	

}
