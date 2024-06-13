

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" ></script>

</head>
<body>
<div class ="container">
<h1 class= "text-primary" style="text-align:center;text-decoration:underline">Register Here....</h1>
<form action= "LoginServlet" method= "post">
<div class="mb-3">
  <label class="form-label">FirstName</label>
  <input type="text" class="form-control" name="firstname">
  
</div>

<div class="mb-3">
  <label class="form-label">LastName</label>
  <input type="text" class="form-control" name="lastname">
  
</div>

<div class="mb-3">
  <label class="form-label">UserName</label>
  <input type="text" class="form-control" name="username">
  
</div>

<div class="mb-3">
  <label class="form-label">Email</label>
  <input type="email" class="form-control" name="email">
  
</div>

<div class="mb-3">
  <label class="form-label">Password</label>
  <input type="password" class="form-control" name="password">
  
</div>

<div class="mb-3">
  <label class="form-label">Address</label>
  <input type="text" class="form-control" name="address">
  
</div>

<div class="mb-3">
  <label class="form-label">Contact</label>
  <input type="number" class="form-control" name="contact">
  
</div>
<button type = "submit" class="btn btn-success" style="position: absolute;left: 45%;padding:7px 50px">Register Now</button>
</form>
</div>
</body>
</html>
