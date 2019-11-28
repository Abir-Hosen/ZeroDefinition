<div class="ui grid">

	<!-- title -->
	<div class="ui row">
		<div class="ui sixteen wide column">
			<h1 class="script" id="page-title"><span id="u">${title}</span></h1><br>
		</div>
	</div>

	<!-- Breadcrumb -->
	<div class="ui row content ">
		<div class="ui big breadcrumb" >
			&nbsp; &nbsp;
			<a class="section" style="color: white;" href="${contextRoot}/home/">Home</a>
			<i class="angle right inverted icon"></i>
			<a class="section" style="color: white;" href="${contextRoot}/blog/">Blog</a>
			<i class="angle right inverted icon"></i>
			<a class="active section" style="color: white;" href="${contextRoot}/blog/viewBlog/${blog.id }/${blog.title}"> ${blog.title}</a>
		</div>
	</div>
	 
	<!-- Share -->
	<div class="ui row ">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<label style="font-size:20px; color: white;">Share: </label>>&nbsp;&nbsp;
				
		<div class="fb-share-button" 
		    data-href="https://www.your-domain.com/your-page.html" 
		    data-layout="button_count">
		</div>
		&nbsp;
	</div>
	
	<!-- Date -->
	<div class="ui row"><label class="date">&nbsp;&nbsp;&nbsp;${blog.pubDate.toString().substring(0, 10) }</label></div><br>
	
	<!-- Details -->
	<div class="ui sixteen wide column">
		<div class="ui row">
			<p>${blog.description }</p>
		</div><br>
		<div class="ui row"><img class="articleImg" src="${images}/${blog.imgUrl}.jpg"></div><br>
		<div class="ui row">
			<p>${blog.conclusion }</p>
		</div>
		
		<!--  ###################  Extended Info Logic area -->
		
		<!--  ###################  Extended Info Logic area finished -->
		<br><br>
		
		<!-- Share -->
		<div class="ui row ">
			<label style="font-size:20px; color: white;">Share: </label>>&nbsp;&nbsp;
					
		<div class="fb-share-button" 
		    data-href="https://www.your-domain.com/your-page.html" 
		    data-layout="button_count">
		</div>
		&nbsp;
		</div>
		<br><br><br>
	</div>
	
</div>
