<?php
$cid = $_POST["cid"];
echo "<h1>Customer Details</h1><hr>";
echo "<p><b>Customer ID: </b>".$cid."</p>";
$conn = new mysqli("localhost", "root","", "bank","3307");
$sql = "SELECT * from customer where cust_id=$cid";
$result = $conn->query($sql);
while($row = $result->fetch_assoc()){
	echo "<p><b>Customer Name: </b>".$row["cust_name"]."</p>";
}

$conn->close();
?>