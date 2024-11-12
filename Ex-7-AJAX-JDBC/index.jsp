<%--Do in eclipse set jdbc.sql and org.json jar files in module path and then deployment Assembly --%>

<%@ page import="java.sql.*"%>  
  
<%  
String s=request.getParameter("val");  
if(s==null || s.trim().equals("")){  
out.print("Please enter id");  
}else{  
int roll=Integer.parseInt(s);  
//out.print(roll);  
try{  
Class.forName("com.mysql.jdbc.Driver");  

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/ajax","root","");  
PreparedStatement ps=con.prepareStatement("select * from students where roll=?");  
ps.setInt(1,roll);  
ResultSet rs=ps.executeQuery();  
while(rs.next()){  
out.print("Roll No.: "+rs.getInt(1)+"<br>Name: "+rs.getString(2)+"<br>Dept: "+rs.getString(3));  
}  
con.close();  
}catch(Exception e){e.printStackTrace();}  
}  
%>  