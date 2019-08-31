<div class="ui grid">

	<!-- title -->
	<div class="ui row">
		<div class="ui sixteen wide column">
			<h1 class="script" id="page-title"><span id="u">${title}</span></h1>
		</div>
	</div>
	
	<!-- Search bar -->
	<div class="ui row">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<div class="ui search" >
		  <input class="prompt" type="text" placeholder="Search Movies...">
		</div>
	</div>
	
	<!-- News -->
	<div class="ui row">
		
		<!-- logic area -->
		<c:forEach items="${movies}" var="movie">
		<div class="ui four wide column">
		
			<div class="ui special cards">
				<div class="card">
					<div >
						<img src="${images}/${movie.imageUrl}.jpg" style=" width: 100%; height: 200px;" >
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/${movie.id}/${movie.name}">${movie.name}</a>
						<div class="meta">
							<span>${movie.releseDate.toString().substring(0, 10) }</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">${movie.synopse.substring(0, 60)}&nbsp;...</p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/${movie.id}/${movie.name}">read more ...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		</c:forEach>
		<!-- logic area finished -->
		
	</div>
	
</div><br><br><br>