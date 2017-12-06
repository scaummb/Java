package srevletTest.Sessions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShowSession extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String title = "Session Tracking Example";
		HttpSession session = req.getSession(true);
		String heading;
		// Use getAttribute instead of getValue in version 2.2.
		Integer accessCount = (Integer) session.getAttribute("accessCount");
		if(accessCount == null){
			accessCount = new Integer(0);
			heading = "welcome Newcomer.";
		} else{
			heading="Welcome back.";
			accessCount = new Integer(accessCount.intValue()+1);
		}
		// Use setAttribute instead of putValue in version 2.2.
		session.setAttribute("accessCount", accessCount);
		
		out.println("<html><head><title>Session×·×Ù</title></head>"
				+ "<BODY BGCOLOR=\"#FDF5E6\">\n" + "<H1 ALIGN=\"CENTER\">"
				+ heading + "</H1>\n"
				+ "<H2>Information on Your Session:</H2>\n"
				+ "<TABLE BORDER=1 ALIGN=\"CENTER\">\n"
				+ "<TR BGCOLOR=\"#FFAD00\">\n" + "  <TH>Info Type<TH>Value\n"
				+ "<TR>\n" + "  <TD>ID\n" + "  <TD>" + session.getId() + "\n"
				+ "<TR>\n" + "  <TD>Creation Time\n" + "  <TD>"
				+ new Date(session.getCreationTime()) + "\n" + "<TR>\n"
				+ "  <TD>Time of Last Access\n" + "  <TD>"
				+ new Date(session.getLastAccessedTime()) + "\n" + "<TR>\n"
				+ "  <TD>Number of Previous Accesses\n" + "  <TD>"
				+ accessCount + "\n" + "</TABLE>\n" + "</BODY></HTML>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}
	

}
