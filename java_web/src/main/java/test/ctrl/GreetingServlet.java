package test.ctrl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http:// server ip : port / context / greeting
@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("debug >>> clien path /greeting : " + uri );
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		if(id.equals("bgjeong") && pwd.equals("bgjeong")) {
			response.sendRedirect("ok.jsp");
		}else {
			response.sendRedirect("error.jsp");
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		System.out.println("debug >>> request Post");
		response.setCharacterEncoding("euc-kr");
		response.getWriter().append("Served at: ").append("서블릿 통신");
	}

}
