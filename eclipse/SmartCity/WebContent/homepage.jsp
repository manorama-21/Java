<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>My Home Page</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<style>
	*{
	margin: 0px;
	padding: 0px;
}

header{
	width: 100%;
	height: 100vh;
	background-image: url("https://t4.ftcdn.net/jpg/05/05/51/25/360_F_505512599_D6ulJI9hV6aGTP04FPC2XDk5QHGOQtpW.jpg");
	background-size: cover;
	
}

.header_menu{
	width: 100%;
	height: 60px;
	display: flex;
	flex-direction: row;
	align-items: center;
	background-color:black;
	box-shadow: -2px -2px 20px -2px black; 
}

.logo h1{
	
	color: white;
	margin-left: 70px;
}

.menu_list{
	width: 80%;
	text-align: right;
	padding-right: 50px;

}

.menu_list li{
	display: inline-block;
	text-transform: uppercase;
	list-style: none;
	letter-spacing: 2px;
	padding-left: 50px;
}

.menu_list li a{
	text-decoration: none;
	color: white;
}

.menu_list li a:hover{
	color: yellow;
}

.header_content{
	width: 100%;
	height: 200px;
	position: absolute;
	top:50%;
	left: 50%;
	transform: translate(-50%,-50%);
	text-align: center;
}

.header_content h2{
	margin-bottom: 50px;
	font-size: 17px;
	font-weight: 200px;
	letter-spacing: 0.3em;
	color: white;
}

.header_content h1{
	margin-bottom: 50px;
	font-size: 70px;
	font-weight: 500px;
	letter-spacing: 0.5em;
	color: white;
}


	</style>
	
</head>
<body>
<header>
	<div class="header_menu">
		<div class="logo">
		<img alt="Homepage" src="https://st2.depositphotos.com/1874273/6290/v/950/depositphotos_62907815-stock-illustration-tourist-guide-logo.jpg" style="width:50px;height:50px;position:absolute;left:20px;top:7px">
			
		</div>
		<div class="menu_list">
			<ul>
				<li><a href="##">Home</a></li>
				<li><a href="city_profile.jsp">City-Profile</a></li>
				<li><a href="##">Gallery</a></li>
				<li><a href="contact.jsp">Contact-Us</a></li>
			
			</ul>
		</div>
	</div>

	<div class="header_content">
		<h1>SMART CITY</h2>
		<h2>( CITY GUIDE )</h1>

		<!-- <button><a href="##">CONTACT</a></button> -->
	</div>
</header>
</body>
</html>