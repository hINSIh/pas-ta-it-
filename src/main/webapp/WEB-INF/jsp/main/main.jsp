<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- jquery easing effect -->
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
</head>
<body>

<div id="wrap">
	
	<div class="navMenu">
		
		<!-- close btn -->
		<div class="navClose">
			<i class="glyphicon glyphicon-remove"></i>
		</div>
		
		<!-- user info -->
		<div class="userInfo">
			<div>
				<span>user</span>님 환영합니다!
			</div>
			<div>
				<span>user@user.com</span>
				<button>로그아웃</button>
			</div>
		</div>
		
		<!-- project List -->
		<div class="projectList">
			<ul>
				<li class="listActive"><a href="#">project1</a><i class="glyphicon glyphicon-ok"></i></li>
				<li><a href="#">project2</a></li>
				<li><a href="#">project3</a></li>
				<li><a href="#">project4</a></li>
			</ul>
		</div>
		
		<!-- project ect -->
		<div class="projectEct">
			<div class="proKey">
				<span>Project1</span><br>
				key : <span class="key">01234567ffffffsgysdg</span>
			</div>
			<div class="proJoin">
				<button>참가하기</button>
			</div>
		</div>
		
		<div>
			Copyright --
		</div>
		
	</div>

	<!-- project info (프로젝트명, 참여자, 포스티잇 수, 내비메뉴아이콘) -->
	<div class="jumbotron">
		<div class="container">
			<!-- project name -->
			<h2 class="proName">
				ProjectName
			</h2>
			
			<!-- project explain(참여자, 포스티잇 수, 내비메뉴아이콘) -->
			<ul class="proExplain">
				<li>
					<h4>1000</h4>
					<span>참여자</span>
				</li>
				<li>
					<h4>0</h4>
					<span>포스티잇 수</span>
				</li>
				<li class="proNav">
					<i class="glyphicon glyphicon-align-justify"></i>
				</li>
			</ul>
		
		</div>
	</div>

	<!-- project  -->
	<div class="container projectBoard">
		<!-- project tab -->
		<ul class="nav nav-tabs">
			<li class="tabActive"><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
		</ul>
		<!-- project content -->
		<div class="projectContent col-md-12">
			<!-- postit plus btn -->
			<div class="postPlus">
				
			</div>
		</div>
	</div>

</div>

<script>

$(document).ready(function(){
	
	//project content height size
	var jumbotronHeight = $(".jumbotron").innerHeight();
	var navTabHeight = $(".nav-tabs").innerHeight();
	var windowHeight = $(window).height();
	
	$(".projectContent").height(windowHeight - (jumbotronHeight + navTabHeight) - 50);
	$(".navMenu").height(windowHeight);
	
	//nav icon click
	$(".proNav i").on("click",function(){
		if ($(".navMenu").is(":animated")){
			return false;
		} else {
			$(".navMenu").animate({
				right:0
			},1500,'easeOutBounce');
		}
	})
	$(".jumbotron *, .projectBoard *, .navClose i").on("click",function(){
		if ($(".navMenu").is(":animated")){
			return false;
		} else {
			$(".navMenu").animate({
				right:"-20%"
			},1500,'easeOutBounce');
		}
	})
	
});

</script>	
</body>
</html>