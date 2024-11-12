<?php
$eid = $_POST["eid"];
$ename = $_POST["ename"];
$des = $_POST["des"];
$dept = $_POST["dept"];
$doj = $_POST["doj"];
$sal = $_POST["sal"];
$conn = new mysqli("localhost", "root","", "company","3307");
$sql = "UPDATE employees set ename='$ename',desig='$des',dept='$dept',doj='$doj',salary=$sal where empid=$eid";
if($conn->query($sql)===TRUE){
	echo "<h2>Employee Updated Successfully!</h2>";
}
else{
	echo "Error: ".$sql."<br>".$conn->error;
}

$conn->close();
?>