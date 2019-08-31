<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<!-- Alert -->
<c:if test="${not empty message}">	
<div class="ui container">
	<div class="ui basic modal">
<!-- 		<i class="close icon"></i>
 -->		<div class="header">
			Note:
		</div>
		<div class="content">
			<p>${message} </p>
		</div>
		<div class="actions">
			<div class="ui green approve button">Approve</div>
<!-- 			<div class="ui basic red cancel button">Cancel</div>
			<div class="ui basic button">Neutral</div> -->
		</div>
	</div>
</div>
</c:if>
<!-- Alert -->

<div class="ui grid">

	<!-- title -->
	<div class="ui row">
		<div class="ui sixteen wide column">
			<h1 class="script" id="page-title"><span id="u">Manage ${title}</span></h1>
		</div>
	</div>
	
	<!-- Publish News Form-->
	<div class="ui row content" >
		<div class="ui sixteen wide column">
			<sf:form class="ui form" modelAttribute="news"
				action="${contextRoot}/manage/news" method="POST" 
				enctype="multipart/form-data">
				<div class="two fields">
					<div class="field">
						<label id="columnName">Category</label>
						<sf:select class="ui dropdown" path="catId"
							items="${categories}"
							itemLabel="name"
							itemValue="id"
						/>
					</div>
					<div class="field">
						<label id="columnName">Add New Category</label>
						<button class="ui orange inverted fluid button" type="button">Click Here</button>
					</div>
				</div>
				<div class="ui sixteen wide field">
					<label id="columnName" for="title">News Title</label>
					<sf:input type="text" id="title" placeholder="News Title" path="title"></sf:input>
					<sf:errors path="title" cssClass="error" element="em"></sf:errors>
				</div>
				<div class="two fields">
					<div class="field">
						<label id="columnName" for="introduction">News Introduction</label>
						<sf:textarea rows="6" cols="4" id="introduction" placeholder="News Introduction" path="introduction"></sf:textarea>
						<sf:errors path="introduction" cssClass="error" element="em"></sf:errors>
					</div>
					<div class="field">
						<label id="columnName" for="conclusion">News Conclusion</label>
						<sf:textarea rows="6" cols="4" id="conclusion" placeholder="News Conclusion" path="conclusion"></sf:textarea>
						<sf:errors path="conclusion" cssClass="error" element="em"></sf:errors>
					</div>
				</div>
				<div class="ui sixteen wide field">
					<label id="columnName" for="description">News Description</label>
					<sf:textarea rows="6" cols="4" id="description" placeholder="News Description" path="description"></sf:textarea>
					<sf:errors path="description" cssClass="error" element="em"></sf:errors>
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
				<sf:hidden path="pubDate"/>
				<sf:hidden path="imgUrl"/>
				<sf:hidden path="views"/>
				
				<div class="ui sixteen wide column">
					<button class="ui green fluid button" type="submit">Submit</button>
				</div>
			</sf:form>
		</div>
	</div>
	
	<div>
		<br><br><br>
	</div>
	
	<!-- Breadcrumb -->
	<div class="ui row content ">
		<div class="ui big breadcrumb" >
			&nbsp; &nbsp;
			<a class="section" style="color: white;" href="${contextRoot}/home/">Home</a>
			<i class="angle right inverted icon"></i>
			<a class="section" style="color: white;" href="${contextRoot}/blog/">Blog</a>
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
	
	<!-- News -->
	<div class="ui row">
	<br>
		<!-- logic area -->
		<c:forEach items="${nnews}" var="news">
		<div class="ui grid" style="background-color:#051821; ">
			<div class="ui sixteen wide column" style="background-color:#051d28; font-style: italic;">
				<a class="header" style="color: #a1e2bf; font-size: 30px;" href="${contextRoot}/news/viewNews/${news.id }/${news.title}">${news.title}</a>
			</div>
			<div class="ui row">
				<div class="ui ten wide column">
					<img src="${images}/${news.imgUrl}.jpg" style=" width: 100%; height: 300px;" >
				</div>
				<div class="ui six wide column">
					<div class="extra">
						<p style="color: #93b8c9; font-size:19px;">${news.description.substring(0, 150)}... </p>
						<a style="color:red;" href="${contextRoot}/news/viewNews/${news.id }/${news.title}">read more</a>
					</div><br>
					<span class="date">Date: ${news.pubDate.toString().substring(0, 10)}</span>
					<div class="ui row"><br>
						<c:if test="${news.active==true}" >
							<div class="ui buttons">
							 	<button class="ui purple button">Activated</button>
							 	<div class="or" data-text="or"></div>
							 	<button class="ui button">Deactivated</button>
							</div>
						</c:if>
						<c:if test="${news.active!=true}" >
							<div class="ui buttons">
							 	<button class="ui button">Activated</button>
							 	<div class="or" data-text="or"></div>
							 	<button class="ui purple button">Deactivated</button>
							</div>
						</c:if>
					</div>
					<div class="ui row"><br><a href="${contextRoot}/manage/${news.id }/news">
						<button class="ui inverted primary fluid button">Edit</button></a>
					</div>
				</div>
			</div>
		</div><div><br><br><br></div>
		</c:forEach>
		<!-- logic area finished -->
		
	</div>

</div>	
<br><br><br>