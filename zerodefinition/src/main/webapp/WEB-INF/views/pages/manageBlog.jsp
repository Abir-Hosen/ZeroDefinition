<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<!-- Alert -->
<c:if test="${not empty message}">	
<div class="ui container">
	<div class="ui basic modal">
		<div class="header">
			Note:
		</div>
		<div class="content">
			<p>${message} </p>
		</div>
		<div class="actions">
			<div class="ui green approve button">Approve</div>
		</div>
	</div>
</div>
</c:if>
<!-- Alert -->

<div class="ui grid">

	<!-- title -->
	<div class="ui row">
		<div class="ui sixteen wide column">
			<h1 class="script" id="page-title"><span id="u"><a href="${contextRoot}/manage/blog" style="color: white;">Manage ${title}</a></span></h1>
		</div>
	</div>
	
	<!-- Publish News Form-->
	<div class="ui row content" >
		<div class="ui sixteen wide column">
			<sf:form class="ui form" modelAttribute="blog"
				action="${contextRoot}/manage/blog" method="POST"
				enctype="multipart/form-data">
				
				<div class="two fields">
					<div class="field">
						<label id="columnName">Category</label>
						<sf:select class="ui dropdown"  path="catId"
							items="${categories}"
							itemLabel="name"
							itemValue="id"
						/>
					</div>
					<div class="field">
						<label id="columnName">Add New Category</label>
						<button class="ui teal fluid button" type="button">Click Here</button>
					</div>
				</div>
				<div class="ui sixteen wide field">
					<label id="columnName" for="title">Blog Title</label>
					<sf:input type="text" id="title" placeholder="News Title" path="title"></sf:input>
					<sf:errors path="title" cssClass="error" element="em"></sf:errors>
				</div>
				<div class="two fields">
					<div class="field">
						<label id="columnName" for="description">Blog Description</label>
						<sf:textarea rows="6" cols="4" id="description" placeholder="News Description" path="description"></sf:textarea>
						<sf:errors path="description" cssClass="error" element="em"></sf:errors>
					</div>
					<div class="field">
						<label id="columnName" for="conclusion">Blog Conclusion</label>
						<sf:textarea rows="6" cols="4" id="conclusion" placeholder="News Conclusion" path="conclusion"></sf:textarea>
						<sf:errors path="conclusion" cssClass="error" element="em"></sf:errors>
					</div>
				</div>
				<div class="two fields">
					<div class="field">
						<label id="columnName" for="file">Upload Blog Image</label>
						<sf:input type="file" id="file" path="file"></sf:input>
						<sf:errors path="file" cssClass="error" element="em"></sf:errors>
					</div>
					<div class="field">
						<label id="columnName">Active Status</label>
						<sf:select class="ui dropdown" id="activeStatus" path="active">
							<option value="true">True</option>
							<option value="false">False</option>
						</sf:select>
					</div>
				</div>
				
				<sf:hidden path="id"/>
				<sf:hidden path="access" value="3"/>
				<sf:hidden path="pubDate"/>
				<sf:hidden path="imgUrl"/>
				<sf:hidden path="views"/>
				
				<div class="ui sixteen wide column">
					<button class="ui green fluid button" type="submit">Submit</button>
				</div>
			</sf:form>
		</div>
	</div>
	
	<div><br><br><br></div>
	
	<!-- Breadcrumb -->
	<div class="ui row content ">
		<div class="ui big breadcrumb" >&nbsp;&nbsp;&nbsp;&nbsp;
			<a class="section" style="color: white;" href="${contextRoot}/home/">Home</a>
			<i class="angle right inverted icon"></i>
			<a class="active section" style="color: white;" href="${contextRoot}/blog/">${title}</a>
		</div>
	</div>
	
	<!-- Search bar -->
<%-- 	<div class="ui row">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
	</div> --%>
	<div>
		<br>
	</div>
	<!-- Article -->
	<!-- Logic Area Started -->
	<c:forEach items="${blogs}" var="blog">
	<div class="ui sixteen wide column content">
		<div class="ui row"><a class="article" href="${contextRoot}/blog/viewBlog/${blog.id }/${blog.title}">${blog.title}</a></div><br>
		<div class="ui row"><label class="date">${blog.pubDate.toString().substring(0, 10) }</label></div><br>
 		<div class="ui row">
  		<c:if test="${blog.active==true}" >
			<div class="ui buttons">
			 	<button class="ui purple button">Activated</button>
			 	<div class="or" data-text="or"></div>
			 	<button class="ui button">Deactivated</button>
			</div>
		</c:if>
		<c:if test="${blog.active!=true}" >
			<div class="ui buttons">
			 	<button class="ui button">Activated</button>
			 	<div class="or" data-text="or"></div>
			 	<button class="ui purple button">Deactivated</button>
			</div>
		</c:if>
		</div><br>
		<div class="ui row"><img class="articleImg" src="${images}/${blog.imgUrl}.jpg"></div><br>
		<div class="ui row"><p>${blog.description.substring(0, 250)}&nbsp...</p></div><br>
		<div class="ui row"><a style="color: red; font-size: 15px;" href="${contextRoot}/blog/viewBlog/${blog.id }/${blog.title}">Read More ...</a></div>
		<div class="ui row"><br><a href="${contextRoot}/manage/${blog.id}/blog">
			<button class="ui inverted primary fluid button">Edit</button><br></a>
		</div>
	</div>
	<div>
		<br><br><br>
	</div>
	</c:forEach>
	<!-- Logic Area Ended -->

</div>	<br><br><br>