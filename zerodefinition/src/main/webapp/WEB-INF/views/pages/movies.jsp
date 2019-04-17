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
					<div class="blurring dimmable image">
						<img src="${images}/3.png" >
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/${movie.id}/${movie.name}">${movie.name}</a>
						<div class="meta">
							<span>${movie.releseDate}</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">${movie.description}<br>${movie.synopse}</p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		</c:forEach>
		<!-- logic area finished -->
		
	</div>
	
</div><br><br><br>