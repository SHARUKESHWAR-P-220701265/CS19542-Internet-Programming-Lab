import java.sql.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FindBook")
public class FindBook extends HttpServlet {
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
			PreparedStatement ps = conn.prepareStatement("select * from books where book_name=?");
			String b_name = request.getParameter("bname");
			ps.setString(1, b_name);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				out.println("Book ID: "+ rs.getString(1)+"<br>");
				out.println("Book Name: "+ rs.getString(2)+"<br>");
				out.println("Author; "+ rs.getString(3)+"<br>");
				out.println("Publisher: "+ rs.getString(4)+"<br>");
				out.println("Edition: "+ rs.getString(5)+"<br>");
				out.println("Price: "+ rs.getString(6)+"<br>");
				out.println("Category: "+ rs.getString(7)+"<br>");
			} else {
			    // Book not found
			    out.println("Book not found.");
			}
		}catch(Exception e) {
			out.println(e);
		}
	}
}
