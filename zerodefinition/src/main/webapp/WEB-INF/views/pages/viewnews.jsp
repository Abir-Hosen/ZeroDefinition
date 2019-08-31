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
			<a class="active section" style="color: white;"  href="${contextRoot}/news/viewNews/${news.id }/${news.title}">${news.title}</a>
		</div>
	</div>
	
	<!-- Share -->
	<div class="ui row ">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<label style="font-size:20px; color: white;">Share: </label>>&nbsp;&nbsp;
		<a href="#"><i class="facebook large inverted icon"></i></a>&nbsp;
		<a href="#"><i class="twitter large inverted icon"></i></a>&nbsp;
		<a href="#"><i class="linkedin large inverted icon"></i></a>
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
		<a style="color: red; font-size: 16px;" href="https://www.nobobarta.com/article/%E0%A6%B6%E0%A6%BF%E0%A6%95%E0%A7%8D%E0%A6%B7%E0%A6%BE%E0%A6%99%E0%A7%8D%E0%A6%97%E0%A6%A8/%E0%A6%A8%E0%A7%8B%E0%A7%9F%E0%A6%BE%E0%A6%96%E0%A6%BE%E0%A6%B2%E0%A7%80-%E0%A6%AC%E0%A6%BF%E0%A6%9C%E0%A7%8D%E0%A6%9E%E0%A6%BE%E0%A6%A8-%E0%A6%93-%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%AF%E0%A7%81/89875/%E0%A6%A8%E0%A7%8B%E0%A6%AC%E0%A6%BF%E0%A6%AA%E0%A7%8D%E0%A6%B0%E0%A6%AC%E0%A6%BF%E0%A6%A4%E0%A7%87-%E0%A6%AE%E0%A7%81%E0%A6%95%E0%A7%8D%E0%A6%A4%E0%A6%BF%E0%A6%AF%E0%A7%81%E0%A6%A6%E0%A7%8D%E0%A6%A7/?fbclid=IwAR2mTlTypm75dxRyEMv0lxA_bg0ynvXqgVYMkp4gYbA_y1dkfJhkQ0h1_ns">
			http://www.nobobarta.com/article/songram-Novobarta
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
		<a href="#"><i class="facebook large inverted icon"></i></a>&nbsp;
		<a href="#"><i class="twitter large inverted icon"></i></a>&nbsp;
		<a href="#"><i class="linkedin large inverted icon"></i></a>
	</div>
	
</div><br><br><br>