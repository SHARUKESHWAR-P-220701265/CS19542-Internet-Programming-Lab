<?php
$eid = $_POST["eid"];
$ename = $_POST["ename"];
$des = $_POST["des"];
$dept = $_POST["dept"];
$doj = $_POST["doj"];
$sal = $_POST["sal"];
$conn = new mysqli("localhost", "root","", "company","3307");
$sql = "INSERT into employees values($eid,'$ename','$des','$dept','$doj',$sal)";
if($conn->query($sql)===TRUE){
	echo "<h2>Employee inserted Successfully!</h2>";
}
else{
	echo "Error: ".$sql."<br>".$conn->error;
}

$conn->close();
?>