<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Us</title>
<style>
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
	padding-right: 30px;

}

.menu_list li{
	display: inline-block;
	text-transform: uppercase;
	list-style: none;
	letter-spacing: 1px;
	padding-left: 30px;
}

.menu_list li a{
	text-decoration: none;
	color: white;
}

.menu_list li a:hover{
	color: yellow;
}




* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: Arial, sans-serif;
	line-height: 1.6;
	background-image:url("https://factbites.com/wp-content/uploads/2020/12/CTO_serv_background.jpg");
}


/* Header styles */
header {
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 20px;
	background-color: #333;
	color: white;
	height: 4rem;
}


.logo {
	font-size: 2rem;
}

nav {
	width: 30rem;
}

nav ul {
	list-style: none;
	display: flex;
	justify-content: space-between;
}

nav ul li a {
	font-size: 1.2rem;
	padding: 1rem;
	text-decoration: none;
	color: white;
}

nav ul li a:hover {
	background-color: #0dac30;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}
.reachUs-button {
	padding: 1rem;
	background-color: #0dac30;
	border: none;
	color: white;
	border-radius: 4px;
	cursor: pointer;
}
.reachUs-button:hover{
	background-color: #1ac840;
}

/* banner section styles */
.banner {
	text-align: center;
	background-color: #ffffff;
	margin: 0 auto;
	
}

.banner img {
	max-width: 100%;
	height: auto;
}
/* Contact form styles */
.contact-form {
	padding: 40px 0;
	margin: 0 10px;
}

.form-container {
	max-width: 40%;
	margin: 0 auto;
	padding: 20px;
	background-color: #ffffff;
	border-radius: 10px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
}

.contact-form h2 {
	text-align: center;
	margin-bottom: 20px;
}

.form-group {
	margin-bottom: 20px;
}

.form-container label {
	display:block;
	font-weight: bold;
}
.form-container input, textarea{
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 4px;
	margin-bottom: 1rem;
	resize: vertical;
}
.submit-button {
	padding: 10px 20px;
	background-color: #0dac30;
	border: none;
	color: white;
	border-radius: 4px;
	font-size: 1rem;
	cursor: pointer;
}

/* Contact info styles */
.contact-info {
	text-align: center;
	padding: 50px 0;
	background-color: #f7f7f7;
}

.contact-info h2 {
	margin-bottom: 20px;
}

/* Footer styles */
footer {
	padding: 20px;
	text-align: center;
	background-color: #333;
	color: white;
}
/* Hamburger styles */
.hamburger {
	display: none;
	color: rgb(0, 0, 0);
	font-size: 1.5rem;
	cursor: pointer;
}

/* Media queries for responsiveness */
@media only screen and (max-width: 768px) {
	.logo {
		display: none;
	}

	.hamburger {
		display: flex;
	}

	#nav-menu {
		position: absolute;
		top: 4rem;
		left: 0;
		background-color: #333;
		width: 100%;
		display: none;
	}

	#nav-menu.active {
		display: block;
		flex-direction: row;
		padding: 1rem;
	}
}

</style>

</head>
<body>

<header>
	<div class="header_menu">
		<div class="logo">
		<img alt="" src="https://st2.depositphotos.com/1874273/6290/v/950/depositphotos_62907815-stock-illustration-tourist-guide-logo.jpg" style="width:50px;height:50px;position:absolute;left:20px;top:7px">
			
		</div>
		<div class="menu_list">
			<ul>
				<li><a href="homepage.jsp">Home</a></li>
				<li><a href="##">City-Profile</a></li>
				<li><a href="##">Gallery</a></li>
				<li><a href="contact.jsp">Contact</a></li>
				<li><a href="homepage.jsp" >Go To Homepage</a>
			
			</ul>
		</div>
	</div>
	</header>
	
<section class="banner">
        <img src=
"https://media.geeksforgeeks.org/wp-content/uploads/20230822131732/images.png"
            alt="Welcome to our Contact Us page">
        <h1>GIVE US FEEDBACK</h1>
       
    </section>
 
    <!-- Contact form -->
    <section class="contact-form">
        <div class="form-container">
            <h2>Your Details</h2>
            <form action="#" method="POST">
 
                <label for="name">Name: </label>
                <input type="text" id="name" name="name" required>
 
                <label for="email">Email: </label>
                <input type="email" id="email" name="email" required>
 
                <label for="phone">Phone: </label>
                <input type="tel" id="phone" name="phone">
 
                <label for="message">Message: </label>
                <textarea id="message" name="message" rows="4" required></textarea>
 
                <button type="submit" class="submit-button"><a href="homepage.jsp">Submit</a></button>
            </form>
        </div>
    </section>
 
    <!-- Company contact info -->
    <section class="contact-info">
        <h2>CONTACT INFORMATION</h2>
        <address>
            <br>
        			Nsti Allahabad<br>
            Phone: <a href="tel:1234567890">123-456-7890</a><br>
            Email: <a href="mailto:info@example.com">info@example.com</a>
        </address>
    </section>

 
</body>
</html>