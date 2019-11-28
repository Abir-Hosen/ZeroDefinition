<div class="ui grid">

	<!-- title -->
	<div class="ui row">
		<div class="ui sixteen wide column">
			<h1 class="script" id="page-title"><span id="u">${title}</span></h1>
		</div>
	</div>
	
	<!-- Breadcrumb -->
	<div class="ui row content ">
		<div class="ui big breadcrumb" >&nbsp;&nbsp;&nbsp;
			<a class="section" style="color: white;" href="${contextRoot}/home/">Home</a>
			<i class="angle right inverted icon"></i>
			<a class="active section" style="color: white;" href="${contextRoot}/blog/">${title}</a>
		</div>
	</div>
	
	<!-- Search bar -->
<%-- 	<div class="ui row">
		<!-- Selection Option -->
		<select class="ui dropdown">
			<option value="Default">All Categories</option>
			<c:forEach items="${categories}" var="category">
		 		<option value="${category.id}">${category.name }</option>
		  	</c:forEach>
		</select>
		
		<!-- Search Option -->
		<div class="ui search">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  <input class="prompt" type="text" placeholder="Search Movies...">
		  <div class="results"></div>
		</div>
	</div> --%>
	
	<!-- News -->
	<div class="ui row">
	<br>
		<!-- logic area -->
		<c:forEach items="${news}" var="news">
		<div class="ui grid" style="background-color:#051821; ">
			<div class="ui sixteen wide column" style="background-color:#051d28; font-style: italic;">
				<a class="header" style="color: #a1e2bf; font-size: 30px;" href="${contextRoot}/news/viewNews/${news.id }/${news.title}">${news.title}</a>
			</div>
			<div class="ui row">
				<div class="ui ten wide column">
					<img src="${images}/${news.imgUrl}.jpg" style=" width: 100%; height: 300px;" >
				</div>
				<div class="ui six wide column">
					<div class="ui extra">
						<p style="color: #93b8c9; font-size:19px;">${news.description.substring(0, 340)}... </p>
						<a style="color:red;" href="${contextRoot}/news/viewNews/${news.id }/${news.title}">read more</a>
					</div><br>
					<span class="date">Date: ${news.pubDate.toString().substring(0, 10)}</span>
				</div>
			</div>
		</div><div><br><br><br></div>
		</c:forEach>
		<!-- logic area finished -->
		
	</div>
	
</div><br>