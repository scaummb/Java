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
		//out ����Ӧ��ְ��resp����Ӧ��
		PrintWriter out = resp.getWriter();
		//��ȡ���������Ǵ����󴦻�õġ�
		out.println(req.getParameter("param1"));
		//html��ǩ<br>������
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
