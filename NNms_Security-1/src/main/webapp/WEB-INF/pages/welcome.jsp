<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" >
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" href="/resou/css/leftnav.css" >
</head>
<body>
<h1>sucessfully loged in</h1>
<a href="/logout">logout</a>
<div class="side-bar">
<div class="menu">
<div class="item">
<a class="sub-btn"><i class="fas fa-desktop"></i>Commons<i class="fas fa-angle-right dropdown"></i></a>
<div class="sub-menu">

<a href="#" class="sub-item">file</a>
<a href="#" class="sub-item">text</a>
</div>
</div>
<div class="item">
<a class="sub-btn"><i class="fas fa-desktop"></i>Administrator<i class="fas fa-angle-right dropdown"></i></a>
<div class="sub-menu">

<a href="#" class="sub-item">User</a>
<a href="#" class="sub-item">Gps</a>
<a href="#" class="sub-item">Gps</a>
<a href="#" class="sub-item">Gps</a>
<a href="#" class="sub-item">Gps</a>
<a href="#" class="sub-item">Gps</a>
<a href="#" class="sub-item">Gps</a>
</div>
</div>
<div class="item"><a href="#"><i class="fas fa-cogs">Reports</i></a>  </div>

</div>
</div>
<script type="text/javascript">

$(document).ready(function(){

	$('.sub-btn').click(function(){
$(this).next('.sub-menu').slideToggle();
$(this).find('.dropdown').toggleClass('rotate');

		});
	
});
</script>
</body>
</html>