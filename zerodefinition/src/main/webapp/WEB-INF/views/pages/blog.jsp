<div class="ui grid">
	<!-- title -->
	<div class="ui row">
		<div class="ui sixteen wide column">
			<h1 class="script" id="page-title"><span id="u">${title}</span></h1>
		</div>
	</div>
	
	<!-- Breadcrumb -->
	<div class="ui row content ">
		<div class="ui big breadcrumb" >
			&nbsp;&nbsp;&nbsp;&nbsp;
			<a class="section" style="color: white;" href="${contextRoot}/home/">Home</a>
			<i class="angle right inverted icon"></i>
			<a class="active section" style="color: white;" href="${contextRoot}/blog/">${title}</a>
		</div>
	</div>
	
	<!-- Search bar -->
	<div class="ui row">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<!-- Selection Option -->
		<select class="ui dropdown">
			<option value="Default">All Categories</option>
			<c:forEach items="${categories}" var="category">
		 		<option value="${category.id}">${category.name }</option>
		  	</c:forEach>
		</select>
		
		<!-- Search Option -->&nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
		<div class="ui search">
		  <input class="prompt" type="text" placeholder="Search Movies...">
		  <div class="results"></div>
		</div>
	</div>
	
	<div><br></div>
	
	<!-- Article -->
	<!-- Logic Area Started -->
	<c:forEach items="${blogs}" var="blog">
	<div class="ui sixteen wide column content">
		<div class="ui row"><a class="article" href="${contextRoot}/blog/viewBlog/${blog.id }/${blog.title}">${blog.title}</a></div><br>
		<div class="ui row"><label class="date">${blog.pubDate.toString().substring(0, 10) }</label></div><br>
		<div class="ui row"><img class="articleImg" src="${images}/${blog.imgUrl}.jpg"></div><br>
		<div class="ui row"><p>${blog.description.substring(0, 250) }&nbsp...</p></div><br>
		<div class="ui row"><a style="color: red; font-size: 15px;" href="${contextRoot}/blog/viewBlog/${blog.id }/${blog.title}">Read More ...</a></div>
	</div>
	<div>
		<br><br><br>
	</div>
	</c:forEach>
	<!-- Logic Area Ended -->
	
</div><br><br>