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
		margin-top:80px;
		text-align:center;
	}
	
	.wrapper *{
	}
	
	.form-control{
		margin:auto;
		width:80%;
		margin-bottom:5px;
	}
	
	.btn-block{
		margin:auto;
		width:80%;
	}

</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
 <div class="wrapper">
    <form class="form-signin">       
      <h2 class="form-signin-heading">LOGIN</h2>
      <input type="text" class="form-control" name="user_name" placeholder="ID" required="" autofocus="" />
      <input type="password" class="form-control" name="user_pw" placeholder="PASSWORD" required=""/>
      <button class="btn btn-lg btn-primary btn-block" type="submit">SUBMIT</button>
    </form>
  </div>

</body>
</html>