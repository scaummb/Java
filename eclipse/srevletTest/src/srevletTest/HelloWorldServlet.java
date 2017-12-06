package srevletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	/**
	 * 实现一个父类，需要这个东东，不然就还会一直警告
	 */
	private static final long serialVersionUID = 7783517916512330464L;
	
	//HttpServletRequest，HttpServletResponse两个参数是实现了的接口
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		//getWriter():Returns a PrintWriter object that can send character text to the client.
		//下面实现了发送一个静态页面给客户端
	    PrintWriter out = resp.getWriter();
	    out.println("<html><head><title></title></head><body>hello world!</body></html>");;
	    //关闭资源
	    out.flush();//Flushes the stream.
	    out.close();//Closes the stream and releases any system resources associated with it. 
	}

}
