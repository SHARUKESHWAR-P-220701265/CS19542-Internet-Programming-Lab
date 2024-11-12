<?php
$aid = $_POST["aid"];
$atype = $_POST["aname"];
$abal = $_POST["abal"];
$cid = $_POST["cid"];
$conn = new mysqli("localhost", "root","", "bank","3307");
$sql = "INSERT into account values($aid,'$atype','$abal',$cid)";
if($conn->query($sql)===TRUE){
	echo "<h2>New Account Created Successfully!</h2>";
}
else{
	echo "Error: ".$sql."<br>".$conn->error;
}

$conn->close();
?>