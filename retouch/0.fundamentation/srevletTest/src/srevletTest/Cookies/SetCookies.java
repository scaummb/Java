package srevletTest.Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//设置Cookie

//1:服务器可以向客户端写内容
//2:只能是文本内容
//3:客户端可以阻止服务器写入
//4:只能拿自己webapp写入的东西
//5:Cookie分为两种,第一种：属于窗口/子窗口（放在内存中的），第二种：属于文本(有生命周期的）
//6:一个servlet/jsp设置的cookies能够被同一个路径下面或者子路径下面的servlet/jsp读到 (路径 = URL)(路径 != 真实文件路径)

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
		out.println("<html><head><title>设置Cookie</title></head>"
				+ "<BODY>\n" 
				+ "<H1 ALIGN=\"CENTER\">"
				+ "设置Cookie" + "</H1>\n"
				+ "6个Cookie\n"
				+ "<A HREF=\"ShowCookies\">\n"
				+ "查看</A>.\n"
				+ "</BODY></HTML>");

	}

}
