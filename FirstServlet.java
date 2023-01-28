package org.btm.pentagonspaceApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/btm", loadOnStartup=4)
public class FirstServlet extends GenericServlet
{
	public FirstServlet()
	{
		System.out.println("JEE Container create servlet object ");
		
	}
	@Override
	public void init(ServletConfig config) throws ServletException{
		System.out.println("Servlet object initialized by calling init()");
		
		super.init(config);
	
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {

	
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		PrintWriter out=res.getWriter();
		out.print("<html><body bgcolor='yellow'><h1> the student "+name +" "
				+ " from"+place+"</h1></body></html>");
		
		System.out.println("Service() called by JEE Container");
		out.flush();
		
		}
	@Override
	public void destroy()
	{
		System.out.println("destroy() called");
	}
}
