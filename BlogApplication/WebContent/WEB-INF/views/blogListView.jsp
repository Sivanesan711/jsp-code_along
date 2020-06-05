<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BLOG LIST</title>
<link rel="stylesheet" type="text/css" href="./css/blogList.css">
</head>
<body>

<nav>
  <img src="./assets/1.jpeg" alt="logo"/>
  <ul>
  <li><a href="${pageContext.request.contextPath}/BlogController">MY BLOG</a></li>
  <li><a href="${pageContext.request.contextPath}/AllBlogController">ALL BLOG</a></li>
  <li><a href="${pageContext.request.contextPath}/LoginController">LOGIN</a></li>
  <li><a href="${pageContext.request.contextPath}/SignupController">SIGNUP</a></li>
  </ul>
</nav>

<form action="${pageContext.request.contextPath}/BlogController" method="post">
<input id="title" name="title" placeholder="Title" type="text"/>
<textarea id="msg" name="message" placeholder="Description"></textarea>
<button id="post" type="submit">POST</button>
</form>

</body>
</html>