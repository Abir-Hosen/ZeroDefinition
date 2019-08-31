<div class="ui grid">
	<!-- title -->
	<div class="ui row">
		<div class="ui sixteen wide column">
			<h1 class="script" id="page-title"><span id="u">${movie.name}</span></h1>
		</div>
		<div class="ui sixteen wide column line" >
			<h3 class="date" style="text-align:center;">${movie.releseDate.toString().substring(0, 10) }</h3>
		</div>
	</div>
	<div class="ui row">
		<img class="articleImg" src="${images}/${movie.imageUrl}.jpg">
	</div>
	
	<div class="ui row">
		<div class="ui four item fluid red pointing inverted menu" style="text-align:center;">
			<a class="active item">SYNOPSIS</a>
		</div>
		<div class="ui sixteen wide column" style="text-align: center; color: yellow; font-size: 13px;">
			${movie.synopse } 
		</div>
	</div>
	
	<div class="ui row">
		<div class="ui four item fluid red pointing inverted menu" style="text-align:center;">
			<a class="active item">CAST & CRIEW</a>
		</div>
		<div class="ui sixteen wide column" style="text-align: center; color: yellow; font-size: 13px;">
			${movie.cast } 
		</div>
	</div>
	
	<div class="ui row">
		<div class="ui four item fluid red pointing inverted menu" style="text-align:center;">
			<a class="active item">GALLERY</a>
		</div>
	</div>
	<div class="ui row">
		<div class="ui two wide column">
		</div>
		<div class="ui four wide column" style="padding:2%;">
			<img src="${images}/g1.jpg"><br>
		</div>
		<div class="ui four wide column" style="padding:2%;">
			<img src="${images}/g2.jpg"><br>
		</div>
		<div class="ui four wide column" style="padding:2%;">
			<img src="${images}/g3.jpg"><br>
		</div>
		<div class="ui two wide column">
		</div>
		<div class="ui two wide column">
		</div>
		<div class="ui four wide column" style="padding:2%;">
			<img src="${images}/g4.jpg"><br>
		</div>
		<div class="ui four wide column" style="padding:2%;">
			<img src="${images}/g5.jpg"><br>
		</div>
		<div class="ui four wide column" style="padding:2%;">
			<img src="${images}/g6.jpg"><br>
		</div>
		<div class="ui two wide column">
		</div>
	</div>
	
	<div class="ui row">
		<div class="ui four item fluid red pointing inverted menu" style="text-align:center;">
			<a class="active item">VIDEOS</a>
		</div>
	</div>
	
	<div class="ui row">
		<div class="ui sixteen wide column">
			<h2 class="script"><span>OTHER MOVIES</span></h2>
		</div>
	</div>
	
	<div class="ui row">
	
		<!-- logic area -->
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<img src="${images}/3.png">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/movie-title">This is the title of the news.</a>
						<div class="meta">
							<span>27 July 2018</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">This is mews paragraph. This is mews paragraph... </p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		<!-- logic area finished -->
		<!-- logic area -->
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<img src="${images}/3.png">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/movie-title">This is the title of the news.</a>
						<div class="meta">
							<span>27 July 2018</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">This is mews paragraph. This is mews paragraph... </p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		<!-- logic area finished -->
		<!-- logic area -->
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<img src="${images}/3.png">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/movie-title">This is the title of the news.</a>
						<div class="meta">
							<span>27 July 2018</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">This is mews paragraph. This is mews paragraph... </p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		<!-- logic area finished -->
		<!-- logic area -->
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<img src="${images}/3.png">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/movie-title">This is the title of the news.</a>
						<div class="meta">
							<span>27 July 2018</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">This is mews paragraph. This is mews paragraph... </p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		<!-- logic area finished -->
		<!-- logic area -->
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<img src="${images}/3.png">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/movie-title">This is the title of the news.</a>
						<div class="meta">
							<span>27 July 2018</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">This is mews paragraph. This is mews paragraph... </p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		<!-- logic area finished -->
		<!-- logic area -->
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<img src="${images}/3.png">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/movie-title">This is the title of the news.</a>
						<div class="meta">
							<span>27 July 2018</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">This is mews paragraph. This is mews paragraph... </p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		<!-- logic area finished -->
		<!-- logic area -->
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<img src="${images}/3.png">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/movie-title">This is the title of the news.</a>
						<div class="meta">
							<span>27 July 2018</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">This is mews paragraph. This is mews paragraph... </p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		<!-- logic area finished -->
		<!-- logic area -->
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<img src="${images}/3.png">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/movie-title">This is the title of the news.</a>
						<div class="meta">
							<span>27 July 2018</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">This is mews paragraph. This is mews paragraph... </p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		<!-- logic area finished -->
		<!-- logic area -->
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<img src="${images}/3.png">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/movie-title">This is the title of the news.</a>
						<div class="meta">
							<span>27 July 2018</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">This is mews paragraph. This is mews paragraph... </p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		<!-- logic area finished -->
		<!-- logic area -->
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<img src="${images}/3.png">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/movie-title">This is the title of the news.</a>
						<div class="meta">
							<span>27 July 2018</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">This is mews paragraph. This is mews paragraph... </p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		<!-- logic area finished -->
		<!-- logic area -->
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<img src="${images}/3.png">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/movie-title">This is the title of the news.</a>
						<div class="meta">
							<span>27 July 2018</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">This is mews paragraph. This is mews paragraph... </p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		<!-- logic area finished -->
		<!-- logic area -->
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<img src="${images}/3.png">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/movie-title">This is the title of the news.</a>
						<div class="meta">
							<span>27 July 2018</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">This is mews paragraph. This is mews paragraph... </p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		<!-- logic area finished -->
		<!-- logic area -->
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<img src="${images}/3.png">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/movie-title">This is the title of the news.</a>
						<div class="meta">
							<span>27 July 2018</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">This is mews paragraph. This is mews paragraph... </p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/movie-title">read more...</a>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		<!-- logic area finished -->
	</div>
	
	
</div><br><br><br>