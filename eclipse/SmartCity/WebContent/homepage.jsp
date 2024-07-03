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



/* Dropdown Button */
.dropbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
  cursor: pointer;
}

/* Dropdown button on hover & focus */
.dropbtn:hover, .dropbtn:focus {
  background-color: #3e8e41;
}

/* The search field */
#myInput {
  box-sizing: border-box;
  background-image: url('searchicon.png');
  background-position: 14px 12px;
  background-repeat: no-repeat;
  font-size: 16px;
  padding: 14px 20px 12px 45px;
  border: none;
  border-bottom: 2px solid #ddd;
}

/* The search field when it gets focus/clicked on */
#myInput:focus {outline: 3px solid #ddd;}

/* The container <div> - needed to position the dropdown content */
.dropdown {
  position: relative;
  display: inline-block;
}

/* Dropdown Content (Hidden by Default) */
.dropdown-content {
  display: none;
  position: absolute;
  background-color: lightgrey;
  min-width: 200px;
  border: 2px solid #ddd;
  z-index: 1;
  color:indigo;
}

/* Links inside the dropdown */
.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  background-color: lightblue;
}

/* Change color of dropdown links on hover */
.dropdown-content a:hover {background-color: #98CCD2}

/* Show the dropdown menu (use JS to add this class to the .dropdown-content container when the user clicks on the dropdown button) */
.show {display:block;}


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
				<!-- <li><a href="city_profile.jsp">City-Profile</a></li>
				<li><a href="##">Gallery</a></li> -->
				<li><a href="contact.jsp">Contact-Us</a></li>
				<li><a href="">Admin</a></li>
				
			</ul>
		</div>
	</div>

	<div class="header_content">
		<h1>SMART CITY</h2>
		<h2>( CITY GUIDE )</h1>
	
		<!-- <div>
		 <input type="text" placeholder="Search.." id="myInput" onkeyup="filterFunction()">
		 <select>
		 <option value="0">Prayagraj</option>
		 <option value="1">Kanpur</option>
		 <option value="2">Lucknow</option>
		 </select>
		 
</div> -->


<div class="dropdown">
  <button onclick="myFunction()" class="dropbtn">Select Your Favourite City</button>
  <div id="myDropdown" class="dropdown-content">
    <input type="text" placeholder="Search.." id="myInput" onkeyup="filterFunction()">
    <a href="#about">Prayagraj</a>
    <a href="#base">Kanpur</a>
    <a href="#blog">Lucknow</a>
    <a href="#contact">Banaras</a>
   
  </div>
</div>
		<!-- <button><a href="##">CONTACT</a></button> -->
	</div>
</header>



<script>
/* When the user clicks on the button,
toggle between hiding and showing the dropdown content */
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

function filterFunction() {
  const input = document.getElementById("myInput");
  const filter = input.value.toUpperCase();
  const div = document.getElementById("myDropdown");
  const a = div.getElementsByTagName("a");
  for (let i = 0; i < a.length; i++) {
    txtValue = a[i].textContent || a[i].innerText;
    if (txtValue.toUpperCase().indexOf(filter) > -1) {
      a[i].style.display = "";
    } else {
      a[i].style.display = "none";
    }
  }
}
</script>
</body>
</html>