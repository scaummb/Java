package srevletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLife extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet()!!      ");
		resp.setContentType("text/html;charset=GBK");
		PrintWriter out = resp.getWriter();
		
		out.println(this.getServletConfig().getServletName());

		//这样就获取到parameter，name的参数，这些信息在WEB-INF/web.xml文件里面
		out.println(this.getServletConfig().getInitParameter("name"));
		out.println(this.getServletConfig().getInitParameter("gender"));
		out.println(this.getServletConfig().getInitParameter("idel"));
		String s = this.getServletConfig().getInitParameter("idel");
		System.out.println("My idel is : "+ s);
		
		java.util.Enumeration param = this.getServletConfig().getInitParameterNames();
		for(; param.hasMoreElements();){
			String name = param.nextElement().toString();
			String value = this.getServletConfig().getInitParameter(name);
			out.println(value);
			System.out.println("The value is : "+ value);
		}
				
		out.close();
	}
	
	@Override
	public void destroy() {
		System.out.println("Destory..........");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("init()..");
	}

	public ServletLife(){
		System.out.println("Constructor..");
	}

}
