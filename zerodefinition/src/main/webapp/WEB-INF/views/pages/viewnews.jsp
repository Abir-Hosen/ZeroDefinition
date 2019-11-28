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
			<a class="section" style="color: white;" href="${contextRoot}/news/">News</a>
			<i class="angle right inverted icon"></i>
			<a class="active section" style="color: white;"  href="${contextRoot}/news/viewNews/${news.id }/${news.title}">${news.title}</a>
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
	<div class="ui row"><label class="date">&nbsp;&nbsp;&nbsp;${news.pubDate.toString().substring(0,10)}</label></div><br>
	
	<!-- Details -->
	<div class="ui sixteen wide column">
		<div class="ui row"><img class="articleImg" src="${images}/${news.imgUrl}.jpg"></div><br>
		<div class="ui row">
			<p>
				${news.introduction}
			</p>
		</div><br>
		<div class="ui row">
			<p>
				${news.description}
			</p>
		</div><br>
		<a style="color: red; font-size: 16px;" href="https://www.youtube.com/channel/UCUMPv2cFdjzyeF3kcoRyPug/videos" target="_blank">
			View Zero Definition's video
		</a><br><br><br>
		<div class="ui row">
			<p>
				${news.conclusion}
			</p>
		</div><br>
	</div><br>
	
	<!-- Share -->
	<div class="ui row ">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<label style="font-size:20px; color: white;">Share: </label>>&nbsp;&nbsp;
		
		<div class="fb-share-button" 
		    data-href="https://www.your-domain.com/your-page.html" 
		    data-layout="button_count">
		</div>
		&nbsp;
	</div>
	
</div><br><br><br>