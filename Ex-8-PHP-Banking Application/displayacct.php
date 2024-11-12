<?php
$aid = $_POST["aid"];
echo "<h1>Account Details</h1><hr>";
echo "<p><b>Account ID: </b>".$aid."</p>";
$conn = new mysqli("localhost", "root","", "bank","3307");
$sql = "SELECT * from account where acc_no=$aid";
$result = $conn->query($sql);
while($row = $result->fetch_assoc()){
	echo "<p><b>Account Type: </b>".$row["acc_type"]."</p>";
	echo "<p><b>Account Balance: </b>".$row["acc_balance"]."</p>";
	echo "<p><b>Customer ID: </b>".$row["cust_id"]."</p>";
}

$conn->close();
?>