package srevletTest.Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//����Cookie

//1:������������ͻ���д����
//2:ֻ�����ı�����
//3:�ͻ��˿�����ֹ������д��
//4:ֻ�����Լ�webappд��Ķ���
//5:Cookie��Ϊ����,��һ�֣����ڴ���/�Ӵ��ڣ������ڴ��еģ����ڶ��֣������ı�(���������ڵģ�
//6:һ��servlet/jsp���õ�cookies�ܹ���ͬһ��·�����������·�������servlet/jsp���� (·�� = URL)(·�� != ��ʵ�ļ�·��)

public class SetCookies extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		for(int i=0;i<3;i++){
			// Default maxAge is -1, indicating cookie applies only to current browsing session.
			Cookie cookie = new Cookie("Session-Cookie-" + i, "Cookie-Value-S" + i);
			resp.addCookie(cookie);
			// Cookie is valid for an hour, regardless of whether user quits browser, reboots computer, or whatever.
			cookie = new Cookie("Persistent-Cookie-" + i, "Cookie-Value-P" + i);
			cookie.setMaxAge(3600);
			resp.addCookie(cookie);
		}
		PrintWriter out = resp.getWriter();
		out.println("<html><head><title>����Cookie</title></head>"
				+ "<BODY>\n" 
				+ "<H1 ALIGN=\"CENTER\">"
				+ "����Cookie" + "</H1>\n"
				+ "6��Cookie\n"
				+ "<A HREF=\"ShowCookies\">\n"
				+ "�鿴</A>.\n"
				+ "</BODY></HTML>");

	}

}
