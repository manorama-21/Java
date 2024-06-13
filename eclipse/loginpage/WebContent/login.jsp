<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" ></script>

</head>
<body>
<div class ="container">
<h1 class= "text-primary" style="text-align:center;text-decoration:underline">Login Here....</h1>
<form action= "" method= "post">
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

<button type = "submit" class="btn btn-success" style="position: absolute; top: 50%;left: 45%;padding:7px 50px">Login</button>

<h5 style="color:red;text-align:center">If you not an account.....   <a href = "Register.jsp" >Create an new account</a></h5>

</form>
</div>

</body>
</html>
