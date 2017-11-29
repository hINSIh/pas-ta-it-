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
<link rel="stylesheet" href="<c:url value="/resources/css/main.css" />" /> 

<style>
body{
		margin-top:110px;
		text-align:center;
	}
	
	.wrapper *{
	}
	
	.form-control{
		margin:auto;
		width:40%;
	}
	
	.btn-block{
		margin:auto;
		
	}
	
	table{
		height:60%;
		width:50%;
	}
	
	#tr_height{
		height:300px;
	}

</style>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<center>
	<table>
		<tr>
			<td colspan="1"><button id="login_frame" class="btn btn-lg btn-primary btn-block" onclick="button_click(1);">LOGIN</button></td>
			<td colspan="1"><button id="join_frame" class="btn btn-lg btn-primary btn-block" onclick="button_click(2);"> JOIN </button></td>
		</tr>
		<tr id="tr_height">
			<td colspan="2" id="iframe_form"><!-- 아이프레임 -->
				<iframe src='login.jsp' width='100%' height='300'></iframe>
				<script> function button_click(value){
					if(value==1){
						document.getElementById("iframe_form").innerHTML="<iframe src='loginTab' width='100%' height='300'></iframe>"
						}else{
						document.getElementById("iframe_form").innerHTML="<iframe src='registerTab' width='100%' height='300'></iframe>"
					}
				}</script>
			</td>
		
		</tr>
		
	</table>
</center>
</body>
</html>