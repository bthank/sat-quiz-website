<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>SAT Quiz - Custom Error Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<style>
.fakeimg {
	height: 200px;
	background: #aaa;
}

.box img {
	width: 100%;
	height: 100%;
}

.box1 img {
	object-fit: cover;
}

.box2 img {
	object-fit: contain;
}

.box3 img {
	object-fit: fill;
}

.ifont {
	color: white;
}

.fas {
	background: radial-gradient(white 50%, transparent 50%);
}

li {
	font-weight: bold;
	color: white;
}

nav {
	text-align: center;
}




.intro {
  height: 100%;
  margin: 20px 20px 20px 20px;
}

.gradient-custom {
  /* fallback for old browsers */
  
}
</style>
</head>
<body>

	<%@include file="common/common-header1.jsp"%>
	
	
	
	<!-- start -->
	
	
	<div class="bg-image h-100"
		style="background-image: url('https://mdbootstrap.com/img/Photos/new-templates/search-box/img4.jpg');">


		<section class="intro">
			<div class="mask d-flex align-items-center h-100 gradient-custom">
				<div class="container">
					<div class="row justify-content-center">
						<div class="col-12 col-lg-9 col-xl-7">
							<div class="card">
								<div class="card-body p-4 p-md-5">
									<h1 class="mb-4 pb-2" style="font-weight: bold; color: red;">ERROR! ERROR!  SOMETHING TERRIBLE JUST HAPPENED!</h1>












										<div class="row">
											<div class="col-md-12 mb-8">
												<div class="form-outline">

	
	<h3 style="color: black;"> 
	<br><br>
	 message: ${message}</h3>
	
	

												</div>
											</div>
										</div>

										<div class="row">
											<div class="col-md-12 mb-8">
												<div class="form-outline">


	<br><br> 
	        <img src="https://images.unsplash.com/photo-1588665343610-04dfd562e2e7?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NTZ8fHdoYXQlMjBhJTIwbWVzc3xlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"/>
	<br><br> 



												</div>
											</div>
										</div>







							</div>
						</div>
					</div>
				</div>
			</div>
	</div>
	</section>



	</div>
	
	
	
	
	
	
	<!-- end  -->
	
	
	
	
	
	
	

	<%@include file="common/common-footer1.jsp"%>


</body>
</html>