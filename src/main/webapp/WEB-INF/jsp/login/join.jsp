<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/style.css" /> 

<style>
body{
		margin-top:40px;
		text-align:center;
	}
	
	.form-control{
		margin:auto;
		margin-bottom:5px;
	}
	
	.btn-block{
		margin:auto;
	}
	
	table{
		width:80%;
	}

</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<div>
	<h2 class="form-signin-heading">JOIN</h2>
	<center>
	<table>
		<tr>
			<td>NAME</td>
			<td><input type="text" class="form-control" name="user_name" /></td>
		</tr>
		<tr>
			<td>ID</td>
			<td><input type="text" class="form-control" name="user_id" /></td>
		</tr>
		<tr>
			<td>PASS</td>
			<td><input type="text" class="form-control" name="user_pw" /></td>
		</tr>
		<tr>
			<td colspan=2><button class="btn btn-lg btn-primary btn-block" type="submit">SUBMIT</button></td>
		</tr>
	</table>
	</center>
</div>
</body>
</html>