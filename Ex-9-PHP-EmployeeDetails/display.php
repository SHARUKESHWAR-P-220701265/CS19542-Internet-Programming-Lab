<?php
$eid = $_POST["eid"];
echo "<h1>Employee Details</h1><hr>";
echo "<p><b>Employee ID: </b>".$eid."</p>";
$conn = new mysqli("localhost", "root","", "company","3307");
$sql = "SELECT * from employees where empid=$eid";
$result = $conn->query($sql);
while($row = $result->fetch_assoc()){
	echo "<p><b>Employee Name: </b>".$row["ename"]."</p>";
	echo "<p><b>Employee Designation: </b>".$row["desig"]."</p>";
	echo "<p><b>Employee Department: </b>".$row["dept"]."</p>";
	echo "<p><b>Employee Date of Joining: </b>".$row["doj"]."</p>";
	echo "<p><b>Employee Salary: </b>".$row["salary"]."</p>";
}

$conn->close();
?>