<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Code Wall</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
 	<nav>
	<ul>
	<img alt="Logo" src="./assets/1.jpeg">
	<li><a href="${pageContext.request.contextPath}/LoginController">Login</a></li>
	<li><a href="${pageContext.request.contextPath}/SignupController">SignUp</a></li>
	</ul>
	</nav>
	
	<div class="welcome-back">Learn, Code, Repeat</div>
	<div class="sub-text">
		Share something new that you have learnt today in Code Wall community.
	</div>
	
	<div class="signup-form"
		style= "border: 3px solid white;
		width: 20%;
		text-align: center;
		margin-left: 10em;
		margin-top: 1em;
		padding: 1em;">
		<form action="${pageContext.request.contextPath}/SignupController" method="post">
			<label class="label" for="email">Email</label>
			<input type="text" name="email" id="email">
			<label class="label" for="password">Password</label>
			<input type="password" name="password" id="password">
			<label class="label" for="password">Confirm Password</label>
			<input type="password" name="Confirm password" id="password">
			<button class="button" type="submit" style="margin-left: 8em;">Signup</button>
		</form>
	</div>
</body>
</html>