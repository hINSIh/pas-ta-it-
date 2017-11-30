<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="<c:url value="/resources/css/main.css" />">

<!-- jQuery library -->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- jquery easing effect -->
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>


</head>
<body>
<c:set var="contextPath" value="<%= request.getContextPath()%>"></c:set> 
<script>
	//body 바로 밑은 함수 / body 마지막부분은 이벤트 등록
	
	//proNameInputFocusout(프로젝트 이름 바꿨을때 ajax로 값 바꿔주기 / 공백 안들어가게 함)
	//inputThis => input Text(바뀐값) thisTxt => 기존에 있던 값
	function proNameInputFocusout(inputThis){
		var inputVal = $(inputThis).val();
		if (inputVal.trim() == "") {
			//누군가해주세요.... 값 비어있으면 전에 쓰던 name다시 보여지게 해주세여ㅠㅠㅠㅠㅠㅠㅠ
		} else {
			/*
			$.ajax({
				type:"post",
				data:{}, //프로젝트 no, name
				url:"",
				success:function(){
					//input 없애고 바뀐 내용을 .proName에 출력
					
				}
			})
			*/
		}
	}
	
	
	//postit css
	function postitCss(postThis){
		$(postThis).find(".postitDelete").css({
			width:"100%",
			height:"30px",
			background:"rgba(255,255,255,0.3)",
			"text-align":"right",
			"line-height":"30px"
		});
		$(postThis).find(".postitDelete span").css({
			"padding-right":"10px",
			"cursor":"pointer"
		});
		$(postThis).find(".postit textarea").css({
			width:"100%",
			height:"220px",
			border:"none",
			background:"none",
			outline:"none",
			"box-sizing":"border-box",
			padding:"10px"
		});
		
	}
	
	//postitArea focusout (update)
	function postitArea(thisArea){
		var con = $(thisArea).val();
		
		var tabNo = $(thisArea).parents(".projectContent").attr("data-tabNo");
		var userNo = 111;
		var color = $(thisArea).attr("data-color");
		var memoX = $(thisArea).parent().attr("data-x");
		var memoY = $(thisArea).parent().attr("data-y");
		var memoNo = $(thisArea).parent()

		$.ajax({
			type:"POST",
			url:"/it/memoUpdate",
			data:{"content":con,"userNo":userNo,"color":color,"memoX":memoX,"memoY":memoY,"tabNo":tabNo},
			success:function(e){
				alert(e);
			},
			error:function(e2){
				alert(e2);
			}
		});
			
		
	
		
		
	}
	
	
	
</script>

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
				<li><a href="#">project2</a><a href="#"><i class="glyphicon glyphicon-trash"></i></a></li>
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
			<li class="tabActive">1</li>
			<li>2</li>
			<li>3</li>
			<li>4</li>
		</ul>
		<!-- project content -->
		<div class="projectContent col-md-12" data-tabNo="2">
			<!-- postit plus btn -->
			<div class="postPlus">
				<i class="glyphicon glyphicon-plus"></i>
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
	
	//nav icon click -> open
	$(".proNav i").on("click",function(){
		if ($(".navMenu").is(":animated")){
			return false;
		} else {
			$(".navMenu").animate({
				right:0
			},1500,'easeOutBounce');
		}
	})
	//nav -> close
	$(".jumbotron *, .projectBoard *, .navClose i").on("click",function(){
		if ($(".navMenu").is(":animated")){
			return false;
		} else {
			$(".navMenu").animate({
				right:"-20%"
			},1500,'easeOutBounce');
		}
	})
	
	//projectName(tab) DoubleClick -> nameChange!
	$(".proName, .nav-tabs li").on("dblclick",function(){
		if( $(this).find("input").hasClass("proNameInput") ){
			return false;
		} else { 
			var thisTxt = $(this).text();
			$(this).html("<input type='text' value='" + thisTxt.trim() + "'  class='proNameInput' onfocusout='proNameInputFocusout(this)'>");
			
			//만약 nav_tabs li이면 텍스트 정렬 가운데로 바꿔야함!!
			if ( $(this).parent().hasClass("nav-tabs") ){
				$(".proNameInput").css({
					"text-align":"center",
					"width":$(this).width()+"px"
				});
			}
		}
		
	});
	
	//postPlus icon Click postIt
	$(".postPlus").on("click",function(){
		var colors = ["#90c3da","#82d4cd","#f6dda2","#eea4b7","#ecd9da","#85c7e8","#a9ca66"];
		var randomNum = Math.floor((Math.random() * colors.length));
		
		var postit = "<div class='postit' >";
			postit += "<div class='postitDelete' ><span>X</span></div>";
			postit += "<textarea onfocusout='postitArea(this)' data-color='"+colors[randomNum]+"' ></textarea>";
			postit += "</div>";
		
		$(".projectContent").append(postit);
		
		$(".projectContent>div").last().css({
			"background":colors[randomNum],
			"width":"250px",
			"height":"250px",
			"position":"absolute",
			"left":"50%",
			"transform":"translateX(-50%)",
			"top":"35%"
		});
		postitCss($(".projectContent>div").last());
		
		var abc = $(".projectContent>div").last();
		
		abc.attr("data-y",$(".projectContent>div").last().offset().top);
		abc.attr("data-x",$(".projectContent>div").last().offset().left);
		
		//메모 디비에 추가
		$.ajax({
			type:"POST",
			url:"/it/memoInsert",
			data:{
				"tabNo":$(".projectContent>div").last().parents(".projectContent").attr("data-tabNo"),
				"userNo":"2",
				"content":"",
				"memoX":Math.floor($(".projectContent>div").last().offset().top),
				"memoY":$(".projectContent>div").last().offset().left,
				"color":colors[randomNum]
			},
			success:function(no){
				$(".projectContent>div").last().attr("data-memoNo",no);
			}
		});
		
		//삭제
		$(".postitDelete span").on("click",function(){
			var nowthis = $(this);
			$.ajax({
				type:"POST",
				url:"/it/memoDelete",
				data:{
					"memoNo":$(this).parents(".postit").attr("data-memoNo")
				},
				success:function(){
					$(nowthis).parents(".postit").remove();
				}
			});
		});
		
		$(".projectContent>div").last().draggable({
			stop: function( event, ui ) {
				var postitX = ui.position.left-125;
				var postitY = ui.position.top;
				$(this).attr("data-x",postitX);
				$(this).attr("data-y",postitY);
			}
		});
		
		/*
		$("document").on("drag",".postit",function(event, ui){
			alert();
			var postleft = ui.position.left-125;
			//var postright = ui.position.left+125;
			var posttop = ui.position.top;
			//var postbottom = ui.position.top+250;
			
			var con = $(".projectContent");
			
			/*
			console.log(con.innerWidth() + " | " + postleft );
			
			if(postleft <= 10){
				ui.position.left -= 125;
				return false;
			}
			
		});*/
		
	});
	
	
});
</script>

</body>
</html>