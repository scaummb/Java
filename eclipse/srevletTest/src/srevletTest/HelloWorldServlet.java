package srevletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	/**
	 * ʵ��һ�����࣬��Ҫ�����������Ȼ�ͻ���һֱ����
	 */
	private static final long serialVersionUID = 7783517916512330464L;
	
	//HttpServletRequest��HttpServletResponse����������ʵ���˵Ľӿ�
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		//getWriter():Returns a PrintWriter object that can send character text to the client.
		//����ʵ���˷���һ����̬ҳ����ͻ���
	    PrintWriter out = resp.getWriter();
	    out.println("<html><head><title></title></head><body>hello world!</body></html>");;
	    //�ر���Դ
	    out.flush();//Flushes the stream.
	    out.close();//Closes the stream and releases any system resources associated with it. 
	}

}
