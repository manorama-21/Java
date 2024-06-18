<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Now</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" ></script>
</head>
<body>

  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card bg-dark text-white" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">

            <div class="mb-md-5 mt-md-4 pb-5">

              <h2 class="fw-bold mb-2 text-uppercase">REGISTRATION PAGE</h2>

			<form action ="RegisterServlet" method="post">
			
			<div data-mdb-input-init class="form-outline form-white mb-4">
                <input type="text"class="form-control form-control-lg" name="firstname" />
                <label class="form-label" >FirstName</label>
              </div>
			
				<div data-mdb-input-init class="form-outline form-white mb-4">
                <input type="text"class="form-control form-control-lg"  name="lastname"/>
                <label class="form-label" >LastName</label>
              </div>
              
              	<div data-mdb-input-init class="form-outline form-white mb-4">
                <input type="text"class="form-control form-control-lg" name="username"/>
                <label class="form-label" >UserName</label>
              </div>
              
              	<div data-mdb-input-init class="form-outline form-white mb-4">
                <input type="number"class="form-control form-control-lg" name="contact"/>
                <label class="form-label" >Contact</label>
              </div>
              
              <div data-mdb-input-init class="form-outline form-white mb-4">
                <input type="email" id="typeEmailX" class="form-control form-control-lg"  name="email"/>
                <label class="form-label" for="typeEmailX">Email</label>
              </div>

              <div data-mdb-input-init class="form-outline form-white mb-4">
                <input type="password" id="typePasswordX" class="form-control form-control-lg" name="password"/>
                <label class="form-label" for="typePasswordX">Password</label>
              </div>

           

              <button data-mdb-button-init data-mdb-ripple-init class="btn btn-outline-light btn-lg px-5" type="submit" onclick="return Submit();">Registered Now</button>

          

            </div>

            <div>
            </form>
             
              
            </div>

          </div>
        </div>
      </div>
    </div>
  </div>

</body>
</html>