<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<c:if test="${not empty message}">
<!-- Alert -->			
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
<!-- Alert -->
</c:if>


<div class="ui grid">
	<!-- title -->
	<div class="ui row">
		<div class="ui sixteen wide column">
			<h1 class="script" id="page-title"><span id="u"><a href="${contextRoot}/manage/movies" style="color: white;">Manage ${title}</a></span></h1>
		</div><br>
	</div>
	
	<!-- Import Movies -->
	<div class="ui row content" >
			<div class="ui sixteen wide column">
			
				<!--   #######################    Form Option -->
				
				<sf:form class="ui form" modelAttribute="movieF"
							action="${contextRoot}/manage/movies" method="POST" 
							enctype="multipart/form-data">
				
					<div class="two fields">
						<div class="field">
					     	<label id="columnName" for="title">Movie Title</label>
					     	<sf:input type="text" placeholder="Movie Title" id="title" path="name"></sf:input>
					     	<sf:errors path="name" cssClass="error" element="em"></sf:errors>
					    </div>
					    <div class="field">
					     	<label id="columnName" for="director">Director Name</label>
					     	<sf:input type="text" placeholder="Director Name" id="director" path="director"></sf:input>
					     	<sf:errors path="director" cssClass="error" element="em"></sf:errors>
					    </div>
					</div>
					<div class="two fields">
						<div class="field">
					     	<label id="columnName" for="cast">Cast Name</label>
					     	<sf:input type="text" placeholder="Cast" id="cast" path="cast"></sf:input>
					     	<sf:errors path="cast" cssClass="error" element="em"></sf:errors>
					    </div>
					    <div class="field">
  					     	<label id="columnName" for="pubDate">Relese Date</label>
					     	<sf:input type="date" id="pubDate" path="releseDate"></sf:input>
					    </div>
					</div>
					<div class="two fields">
						<div class="field">
 					     	<label id="columnName" for="file">Upload Image</label>
					     	<sf:input type="file" id="file" path="file"></sf:input>
					     	<sf:errors path="file" cssClass="error" element="em"></sf:errors>
					    </div>
					    <div class="field">
					     	<label id="columnName" for="vurl">Upload Video Link</label>
					     	<sf:input type="text" placeholder="Video Link" id="vurl" path="videoUrl"></sf:input>
					    </div>
					</div>
					<div class="two fields">
						<div class="field">
					     	<label id="columnName" for="synopse">Movie Intro</label>
					     	<sf:textarea rows="6" cols="4" path="synopse" placeholder="Movie Intro" id="synopse"></sf:textarea>
					     	<sf:errors path="synopse" cssClass="error" element="em"></sf:errors>
					    </div>
					    <div class="field">
					     	<label id="columnName" for="description">Movie Description</label>
					     	<sf:textarea rows="6" cols="4" path="description" id="description" placeholder="Movie Description" ></sf:textarea>
					     	<sf:errors path="description" cssClass="error" element="em"></sf:errors>
					    </div>
					</div>
					<div class="ui three fields">
						<div class="field">
					     	<label id="columnName">Category</label>
					     	<sf:select class="ui dropdown" id="catId" path="catId"
					     		items="${categories }"
					     		itemLabel="name"
					     		itemValue="id"
					     	/>

					    </div>
					    <div class="field">
							<label id="columnName">Active Status</label>
							<sf:select class="ui dropdown" id="activeStatus" path="active">
								<option value="true">True</option>
								<option value="false">False</option>
							</sf:select>
						</div>
					    <div class="field">
					     	<label id="columnName">Add New Category</label>
					     	<button class="ui teal fluid button" type="button">Click Here</button>
					    </div>
					</div>
					
					<!-- Hidden Field -->
					<sf:hidden path="id"/>
					
					<div class="ui sixteen wide column"><br>
						<button class="ui green fluid button" type="submit">Submit</button>
					</div>
					
					
					
					
				</sf:form>
				
				<!--   #######################    Finished Form -->
				
			</div>
		
	</div>
	
	<!-- Search bar -->
	<div class="ui row">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<div class="ui search" ><br><br><br>
		  <input class="prompt" type="text" placeholder="Search Movies...">
		</div>
	</div>
	
	<!-- Movies -->
	<div class="ui row">
		
		<!-- logic area -->
		<c:forEach items="${movies}" var="movie">
		<div class="ui four wide column">

			<div class="ui special cards">
				<div class="card">
					<div class="blurring dimmable image">
						<div class="ui dimmer">
        					<div class="content">
          						<div class="center"><a href="${contextRoot}/manage/${movie.id}/movies">
            						<div class="ui inverted button">Edit</div></a>
          						</div>
        					</div>
						</div>
						<img src="${images}/${movie.imageUrl}.jpg" style="width: 100%; height: 200px;">
					</div>
					<div class="content">
						<a class="header" style="color: red;" href="${contextRoot}/movies/viewMovie/${movie.id}/${movie.name}">${movie.name}</a>
						<div class="meta">
							<span>${movie.releseDate.toString().substring(0, 10)}</span>
						</div>
					</div>
					<div class="extra content">
						<p style="color:black;">${movie.synopse.substring(0, 60)}&nbsp...</p>
						<a style="color:red;" href="${contextRoot}/movies/viewMovie/${movie.id}/${movie.name}">read more...</a>
					</div>
					<div class="extra content">
						<div class="ui row">
							<c:if test="${movie.active==true}" >
								<div class="ui buttons">
								 	<button class="ui purple button">Activated</button>
								 	<div class="or" data-text="or"></div>
								 	<button class="ui button">Deactivated</button>
								</div>
							</c:if>
							<c:if test="${movie.active!=true}" >
								<div class="ui buttons">
								 	<button class="ui button">Activated</button>
								 	<div class="or" data-text="or"></div>
								 	<button class="ui purple button">Deactivated</button>
								</div>
							</c:if>
						</div>
					</div>
				</div>
			</div>
			<br>
			
		</div>
		</c:forEach>
		<!-- logic area finished -->
		
	</div>
	
</div><br><br><br>