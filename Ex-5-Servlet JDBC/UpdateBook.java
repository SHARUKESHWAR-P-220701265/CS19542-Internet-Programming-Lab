

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateBook")
public class UpdateBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String URL="jdbc:mysql://localhost:3307/Library";
			Connection conn = DriverManager.getConnection(URL,"root","");
			PreparedStatement ps = conn.prepareStatement("update books set book_name = ?, author = ?, publisher = ?, edition = ?, price = ?, category = ? where book_id=?");
			String b_id = request.getParameter("bid");
			String b_name = request.getParameter("bname");
			String b_auth = request.getParameter("auth");
			String b_pub = request.getParameter("pub");
			String b_ed = request.getParameter("ed");
			String b_price = request.getParameter("price");
			String b_cat = request.getParameter("cat");
			ps.setString(1, b_name);
			ps.setString(2, b_auth);
			ps.setString(3, b_pub);
			ps.setString(4, b_ed);
			ps.setString(5, b_price);
			ps.setString(6, b_cat);
			ps.setString(7, b_id);
			int rs = ps.executeUpdate();
			if (rs > 0) {
                out.println("Book updated successfully!");
            } else {
                out.println("Failed to updated book.");
            }
		}catch(Exception e) {
			out.println(e);
		
	}
	}


}
