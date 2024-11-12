<!DOCTYPE html>
<html>
<head>
<title>Employees</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Employee Details</h1>
	<hr>
	<a href="insert.php"><button>Insert Employee Details</button></a>
	<a href="retrieve.php"><button>Retrieve Employee Details</button></a>
	<a href="update.php"><button>Update Employee Details</button></a>
<hr>
<h1>Insert Employee Details</h1>
<hr>
<form method="post" action="updateemp.php">
Employee ID: <input type="text" name="eid"><br><br>
Employee Name: <input type="text" name="ename"><br><br>
Designation: <input type="text" name="des"><br><br>
Department: <input type="text" name="dept"><br><br>
Date of Joining: <input type="text" name="doj"><br><br>
Salary: <input type="text" name="sal"><br><br>
<input type="submit" value="UPDATE">
</form>
</body>
</html>
