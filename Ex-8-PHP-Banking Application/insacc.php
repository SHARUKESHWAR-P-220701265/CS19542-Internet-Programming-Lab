<!DOCTYPE html>
<html>
<head>
<title>BANK</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>BANK</h1>
	<hr>
	<a href="discust.php"><button>Display Customer Information</button></a>
	<a href="disacc.php"><button>Display Account Information</button></a>
	<a href="inscust.php"><button>Insert Customer Information</button></a>
	<a href="insacc.php"><button>Insert Account Information</button></a>
<hr>
<h1>Insert Account Information</h1>
<hr>
<form method="post" action="insertacct.php">
Account No.: <input type="text" name="aid"><br><br>
Account Type: <input type="text" name="aname"><br><br>
Account Balance: <input type="text" name="abal"><br><br>
Customer ID: <input type="text" name="cid"><br><br>
<input type="submit" value="INSERT">
</form>
</body>
</html>