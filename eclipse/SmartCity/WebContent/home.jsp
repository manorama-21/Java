<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>City Guide</title>
  <style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
}

header {
    background-color: #333;
    color: #fff;
    padding: 1em;
    text-align: center;
}

nav ul {
    list-style: none;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: space-between;
}

nav li {
    margin-right: 20px;
}

nav a {
    color: #fff;
    text-decoration: none;
}

.hero {
    background-image: linear-gradient(to bottom, #333, #666);
    background-size: 100% 300px;
    background-position: 0% 100%;
    height: 300px;
    display: flex;
    justify-content: center;
    align-items: center;
    color: #fff;
}

.hero h1 {
    font-size: 36px;
    margin-bottom: 10px;
}

.hero button {
    background-color: #333;
    color: #fff;
    border: none;
    padding: 10px 20px;
    font-size: 18px;
    cursor: pointer;
}

.features {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
}

.features li {
    margin: 20px;
    width: 250px;
}

.features i {
    font-size: 36px;
    margin-bottom: 10px;
}

.features h3 {
    font-size: 24px;
    margin-bottom: 10px;
}

footer {
    background-color: #333;
    color: #fff;
    padding: 1em;
    text-align: center;
    clear: both;
}
  </style>
    
    
</head>
<body>
    <header>
        <nav>
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </header>
    <main>
        <section class="hero">
            <h1>Welcome to City Guide</h1>
            <p>Explore the best of our city</p>
            <button>Get Started</button>
        </section>
        <section class="features">
            <h2>Discover Our City</h2>
            <ul>
                <li>
                    <i class="fas fa-map-marker-alt"></i>
                    <h3>Explore Neighborhoods</h3>
                    <p>Learn about our city's unique neighborhoods and what they have to offer</p>
                </li>
                <li>
                    <i class="fas fa-utensils"></i>
                    <h3>Food and Drink</h3>
                    <p>Find the best restaurants, cafes, and bars in the city</p>
                </li>
                <li>
                    <i class="fas fa-museum"></i>
                    <h3>Arts and Culture</h3>
                    <p>Discover our city's vibrant arts and culture scene</p>
                </li>
            </ul>
        </section>
    </main>
    <footer>
        <p>&copy; 2023 City Guide</p>
    </footer>
</body>
</html>