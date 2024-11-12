<?php
$cid = $_POST["cid"];
$cname = $_POST["cname"];
$conn = new mysqli("localhost", "root","", "bank","3307");
$sql = "INSERT into customer values($cid,'$cname')";
if($conn->query($sql)===TRUE){
	echo "<h2>New Customer Inserted Successfully!</h2>";
}
else{
	echo "Error: ".$sql."<br>".$conn->error;
}

$conn->close();
?>