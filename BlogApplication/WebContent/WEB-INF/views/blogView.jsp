<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Code Wall</title>
<link rel="stylesheet" type="text/css" href="./css/blog.css">
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
<div class = "body-div1">
	<div>YOUR BLOG POSTS</div>
	<a href="${pageContext.request.contextPath}/BlogController"><button class="button" id="addblog"><i class="fas fa-plus-circle"></i>Add New Post</button></a>
</div>

<div class = "body-div2">
<c:forEach var="blog" items="${listblog}">
	<div class="card-article">
		<div class = "card-test">
			<h1 id="blog-title"><c:out value="${blog.getBlogtitle()}"/></h1>
			<p id="blog-description"><c:out value="${blog.getBlogdescription()}"/></p>
			<p>Posted On <br> <c:out value="${blog.getPostedon()}"/> </br> </p>
		</div>
		<div class = "card-buttons">
		<a href="edit?id=" <c:out value='${blog.getblogid()}'/>>
		<button type="button" id="edit">Edit</button></a>
		<a href="delete?id=" <c:out value='${blog.getblogid()}'/>>
		<button type="button" id="delete">Delete</button></a>
		</div>
	</div>
</c:forEach>
</div>

<div class = "body-div3">
<h1>"${message}"</h1>
</div>


</body>
</html>