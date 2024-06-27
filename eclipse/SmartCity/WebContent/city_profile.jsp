<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>City profile</title>

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
    font-family: 'Open Sans', sans-serif;
}

body {
    background: url("https://th.bing.com/th/id/OIP.v775kD2Px1KJZVsH0kgxkQHaEK?rs=1&pid=ImgDetMain");
    background-repeat:no-repeat;
    background-size:100%;
}

.card-list {
    display: grid;
    grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
    max-width: 1250px;
    margin: 150px auto;
    padding: 20px;
    gap: 20px;
}

.card-list .card-item {
    background: #fff;
    padding: 26px;
    border-radius: 8px;
    box-shadow: 0px 5px 10px rgba(0, 0, 0, 0.04);
    list-style: none;
    cursor: pointer;
    text-decoration: none;
    border: 2px solid transparent;
    transition: border 0.5s ease;
}

.card-list .card-item:hover {
    border: 2px solid #000;
}

.card-list .card-item img {
    width: 100%;
    aspect-ratio: 16/9;
    border-radius: 8px;
    object-fit: cover;
}

.card-list span {
    display: inline-block;
    background: #F7DFF5;
    margin-top: 32px;
    padding: 8px 15px;
    font-size: 0.75rem;
    border-radius: 50px;
    font-weight: 600;
}

.card-list .developer {
    background-color: #F7DFF5; 
    color: #B22485;
}   

.card-list .designer {
    background-color: #d1e8ff;
    color: #2968a8;
}

.card-list .editor {
    background-color: #d6f8d6; 
    color: #205c20;
}

.card-item h3 {
    color: #000;
    font-size: 1.309rem;
    margin-top: 28px;
    font-weight: 600;
}

.card-item .arrow {
    display: flex;
    align-items: center;
    justify-content: center;
    transform: rotate(-35deg);
    height: 40px;
    width: 40px;
    color: #000;
    border: 1px solid #000;
    border-radius: 50%;
    margin-top: 40px;
    transition: 0.2s ease;
}

.card-list .card-item:hover .arrow  {
    background: #000;
    color: #fff; 
}

@media (max-width: 1200px) {
    .card-list .card-item {
        padding: 15px;
    }
}

@media screen and (max-width: 980px) {
    .card-list {
        margin: 0 auto;
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
	
<div class="card-list">
        <a href="#" class="card-item">
            <img src="https://i.ytimg.com/vi/kDlavpEkbb8/maxresdefault.jpg" alt="Card Image">
            <span class="developer">Developer</span>
            <h3>Prayagraj, formerly known as Allahabad, is a major city in the Indian state of Uttar Pradesh. It is the headquarters of Prayagraj district and an important pilgrimage site for Hindus. The place of Prayag mentioned in Hindu scriptures is situated at the confluence of the holiest rivers Ganga and Yamuna.</h3>
           
                
                <a href="">Learn more.........</a>
            
        </a>
        <a href="#" class="card-item">
            <img src="images/designer.jpg" alt="Card Image">
            <span class="designer">Designer</span>
            <h3>A "designer" is a design expert.</h3>
            <div class="arrow">
                <i class="fas fa-arrow-right card-icon"></i>
            </div>
        </a>
        <a href="#" class="card-item">
            <img src="images/editor.jpg" alt="Card Image">
            <span class="editor">Editor</span>
            <h3>An "editor" ensures content quality and accuracy.</h3>
            <div class="arrow">
                <i class="fas fa-arrow-right card-icon"></i>
            </div>
        </a>
    </div>

</body>
</html>