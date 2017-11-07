package srevletTest.Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//读取客户端的Cookie

public class ShowCookies  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	    PrintWriter out = resp.getWriter();
	    String title = "Active Cookies";
	    out.println("<html><head><title>获取客户端Cookie</title></head>" +
	                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
	                "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
	                "<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
	                "<TR BGCOLOR=\"#FFAD00\">\n" +
	                "  <TH>Cookie Name\n" +
	                "  <TH>Cookie Value");	
	    Cookie[] cookies = req.getCookies();
	    if(cookies != null){
	    	Cookie cookie;
	    	for(int i=0; i< cookies.length;i++){
	    		cookie = cookies[i];
	    		out.println("<TR>\n" +
	                    "  <TD>" + cookie.getName() + "</TD>\n" +
	                    "  <TD>" + cookie.getValue() + "</TD></TR>\n" );
	    		
	    	}
	    }
	    out.println("</TABLE></BODY></HTML>");
	    }
	
	

}
