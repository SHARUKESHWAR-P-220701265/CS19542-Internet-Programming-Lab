import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AllBooks")
public class AllBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/Library";
			Connection conn = DriverManager.getConnection(url,"root","");
			PreparedStatement ps = conn.prepareStatement("select * from books;");
			ResultSet rs = ps.executeQuery();
			out.println("<link rel=\"stylesheet\" href=\"style.css\">");
			out.println("<table>");
			out.println("<tr><th>Book ID</th><th>Book Name</th><th>Author</th><th>Publisher</th><th>Edition</th><th>Price</th><th>Category</th></tr>");
			while(rs.next()) {
				out.println("<tr>");
                out.println("<td>" + rs.getString(1) + "</td>");
                out.println("<td>" + rs.getString(2) + "</td>");
                out.println("<td>" + rs.getString(3) + "</td>");
                out.println("<td>" + rs.getString(4) + "</td>");
                out.println("<td>" + rs.getString(5) + "</td>");
                out.println("<td>" + rs.getString(6) + "</td>");
                out.println("<td>" + rs.getString(7) + "</td>");
                out.println("</tr>");
			}
			out.println("</table>");
		}catch(Exception e) {
			out.println(e);
		}
		
		
	}
}
