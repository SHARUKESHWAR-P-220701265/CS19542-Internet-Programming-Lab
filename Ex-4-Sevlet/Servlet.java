

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Form Submitted Successfully</h1>");
		out.println("<hr>");
		out.println("<p>Name: "+request.getParameter("m1")+"</p>");
		out.println("<p>Roll No.: "+request.getParameter("m2")+"</p>");
		out.println("<p>Gender: "+request.getParameter("m3")+"</p>");
		out.println("<p>Year: "+request.getParameter("m4")+"</p>");
		out.println("<p>Department: "+request.getParameter("m5")+"</p>");
		out.println("<p>Section: "+request.getParameter("m6")+"</p>");
		out.println("<p>Mobile No.: "+request.getParameter("m7")+"</p>");
		out.println("<p>Email: "+request.getParameter("m8")+"</p>");
		out.println("<p>Address: "+request.getParameter("m9")+"</p>");
		out.println("<p>City: "+request.getParameter("m10")+"</p>");
		out.println("<p>Country: "+request.getParameter("m11")+"</p>");
		out.println("<p>PinCode: "+request.getParameter("m12")+"</p>");

	}

}
