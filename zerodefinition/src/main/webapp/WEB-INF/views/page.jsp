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
<meta name="description" content="An Film Production based project">
<meta name="author" content="Abir Hosen">

<meta name="${_csrf}" content="${_csrf.token}">
<meta name="${_csrf_header}" content="${_csrf.headerName}">

<title>Zero Definition - ${title}</title>


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
 /*		background-position: center;
 */		background-repeat: round;
		background-size: cover;
	}
</style>

<link rel="icon" href="${images}/favicon.jpg" />
</head>

<body class="bg">

	<div>
		<div class="ui container">

			<%@ include file="./shared/nav.jsp"%>

			<c:if test="${userClickHome==true }">
				<%@ include file="./pages/home.jsp"%>
			</c:if>

			<c:if test="${userClickOurStory==true }">
				<%@ include file="./pages/ourstory.jsp"%>
			</c:if>

			<c:if test="${userClickTheTeam==true }">
				<%@ include file="./pages/theteam.jsp"%>
			</c:if>

			<c:if test="${userClickMovies==true }">
				<%@ include file="./pages/movies.jsp"%>
			</c:if>

			<c:if test="${userClickNews==true }">
				<%@ include file="./pages/news.jsp"%>
			</c:if>

			<c:if test="${userClickBlog==true }">
				<%@ include file="./pages/blog.jsp"%>
			</c:if>

			<c:if test="${userClickConnect==true }">
				<%@ include file="./pages/connect.jsp"%>
			</c:if>
			
			<c:if test="${userClickViewBlog==true }">
				<%@ include file="./pages/viewblog.jsp"%>
			</c:if>
			 
			<c:if test="${userClickViewNews==true }">
				<%@ include file="./pages/viewnews.jsp"%>
			</c:if>
			
			<c:if test="${userClickViewMovie==true }">
				<%@ include file="./pages/viewmovie.jsp"%>
			</c:if>
			
			<c:if test="${userClickManageMovie==true }">
				<%@ include file="./pages/manageMovies.jsp"%>
			</c:if>
			
 			<c:if test="${userClickManageNews==true }">
				<%@ include file="./pages/manageNews.jsp"%>
			</c:if>
			
			<c:if test="${userClickManageBlog==true }">
				<%@ include file="./pages/manageBlog.jsp"%>
			</c:if>
			
			<c:if test="${userClickProfile==true }">
				<%@ include file="./pages/profile.jsp"%>
			</c:if>

			<%@ include file="./shared/footer.jsp"%>
		</div>

	</div>

	<script type="text/javascript">
		window.menu = '${title}';
	</script>

</body>

</html>