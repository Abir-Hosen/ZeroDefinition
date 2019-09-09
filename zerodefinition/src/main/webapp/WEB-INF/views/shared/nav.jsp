<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %> 
	<div class="ui ten item inverted secondary pointing menu" id="menu">
		<a class="ui image" id="logo" href="${contextRoot}/"><img src="${images}/logo.png"></a>
		<a class="item" id="home" href="${contextRoot}/home">HOME</a>
		<a class="item" id="story" href="${contextRoot}/ourstory">OUR STORY</a>
		<a class="item" id="team" href="${contextRoot}/theteam">THE TEAM</a>
		<security:authorize access="hasAuthority('1')">
			<a class="item" id="movies" href="${contextRoot}/manage/movies">MANAGE MOVIES</a>
		</security:authorize>
		<security:authorize access="hasAuthority('1')">
			<a class="item" id="news" href="${contextRoot}/manage/news">MANAGE NEWS</a>
		</security:authorize>
		<security:authorize access="hasAuthority('1')">
			<a class="item" id="blog" href="${contextRoot}/manage/blog">MANAGE BLOG</a>
		</security:authorize>
		<security:authorize access="hasAuthority('2')">
			<a class="item" id="movies" href="${contextRoot}/movies">MOVIES</a>
			<a class="item" id="news" href="${contextRoot}/news">NEWS</a>
			<a class="item" id="blog" href="${contextRoot}/blog">BLOG</a>
			<a class="item" id="connect" href="${contextRoot}/connect">CONNECT</a>
		</security:authorize>
		<security:authorize access="isAnonymous()">
			<a class="item" id="movies" href="${contextRoot}/movies">MOVIES</a>
			<a class="item" id="news" href="${contextRoot}/news">NEWS</a>
			<a class="item" id="blog" href="${contextRoot}/blog">BLOG</a>
			<a class="item" id="signup" href="${contextRoot}/register">SIGN UP</a>
			<a class="item" id="login" href="${contextRoot}/login">LOG IN</a>
		</security:authorize>
		
		<security:authorize access="isAuthenticated()">
			<div class="ui pointing dropdown link item">
				<span class="text">${userModel.name }</span> <i class="dropdown icon"></i>
				<div class="menu">
			 		<div class="header">USER-CAT</div>
					<div class="header"><a href="#">Profile</a></div>
					<div class="header">Home</div>
					<div class="item">
						<i class="dropdown icon"></i> <span class="text">Check</span>
						<div class="menu">
							<div class="header">Notification</div>
							<div class="header">Message</div>
							<div class="header">Friend Request</div>
							<div class="divider"></div>
							<div class="header">Pages</div>
							<div class="header">Group</div>
						</div>
					</div>
					<div class="divider"></div>
					<div class="header">Activity Log</div>
					<div class="header">Setting</div>
					<div class="header"><a href="${contextRoot}/perform-logout">Logout</a></div>
				</div>
			</div>
		</security:authorize>
</div>
