<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>

<html>

<head>

<meta charset="utf-8">
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<meta http-equiv="refresh" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="An ecomerce based project">
<meta name="author" content="Abir Hosen">


<title>Zero Definition - ${title}</title>

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<link href="https://getbootstrap.com/docs/4.0/examples/signin/signin.css" rel="stylesheet" crossorigin="anonymous"/>
   
<link rel="stylesheet" type="text/css" 
	href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.2/semantic.min.css">
<link href="${css}/myapp.css" rel="stylesheet">

<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.js"></script>

<script src="${js}/myapp.js"></script>

<style>
body, html {
	height: 100%;
	margin: 0;
}

.bg {
	/* The image used */
	background-image: url("${images}/13.jpg");
	/* Full height */
	height: 100%;
	/* Center and scale the image nicely */
	background-attachment: fixed;
/* 	background-position: center; */
	background-repeat: round;
	background-size: cover;
}
</style>

<link rel="icon" href="${images}/favicon.jpg" />

</head>

<body class="bg">

	<div>
		<div class="ui container">

			<div class="ui inverted secondary pointing menu" id="menu">
				<div class="left item">
					<a class="ui image" id="logo" href="${contextRoot}/">
						<img src="${images}/logo.png">
					</a> 
				</div>
				<a class="left item" id="home" href="${contextRoot}/home">HOME</a> 
				<a class="left item" id="movies" href="${contextRoot}/movies">MOVIES</a> 
				<a class="left item" id="news" href="${contextRoot}/news">NEWS</a> 
				<a class="left item" id="blog" href="${contextRoot}/blog">BLOG</a>
				<div class="left item">
				</div>
				<div class="left item">
				</div>
				<div class="left item">
				</div>
				<a class="right item" id="signup" href="${contextRoot}/register">SIGN UP</a> 
				<a class="right item" id="login" href="${contextRoot}/login">LOG IN</a>
			</div>
			
			<br><br><br><br><br><br>
			
			<div class="container">
				<c:if test="${not empty message }">
					<div class="ui four column centered grid">
						<div class="column error">${message}</div>
					</div>
				</c:if>
				<c:if test="${not empty logout }">
					<div class="ui four column centered grid">
						<div class="column">${logout}</div>
					</div>
				</c:if>
				<form class="form-signin" method="post"	action="${contextRoot}/login">
				
					<h2 class="form-signin-heading">Please sign in</h2>
					
					<p>
						<label for="username" class="sr-only">Username</label> 
						<input type="text" id="username" name="username" class="form-control"
							placeholder="Username" required autofocus>
					</p>
					
					<p>
						<label for="password" class="sr-only">Password</label> 
						<input type="password" id="password" name="password"
							class="form-control" placeholder="Password" required>
					</p>
					
					<input name="${_csrf.parameterName }" type="hidden"
						value="${_csrf.token }" />
						
					<button class="btn btn-lg gray btn-block" type="submit">
						Sign in
					</button>
						
				</form>
				
			</div>


			<%@ include file="./shared/footer.jsp"%>
		</div>

	</div>

	<script type="text/javascript">
		window.menu = '${title}';
	</script>

</body>

</html>