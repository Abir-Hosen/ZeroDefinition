<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@include file="../shared/flows-header.jsp"%>

	<sf:form class="ui form" method="POST" id="registerForm" modelAttribute="user">
		<div class="field">
			<label>User Name</label> 
			<sf:input type="text" path="name" placeholder="Full Name"></sf:input>
		</div>
		<div class="field">
			<label>Email</label>
			<sf:input type="text" path="email" placeholder="Email"></sf:input>
		</div>
		<div class="field">
			<label>Password</label>
			<sf:input type="password" path="" placeholder="Enter Password"></sf:input>
		</div>
		<div class="field">
			<label>Confirm Password</label>
			<sf:input type="password" path="password" placeholder="Confirm Password"></sf:input>
		</div>
		<sf:hidden path="allowance"/>
		<sf:hidden path="active"/>
		<br>
		<button class="ui button" name="_eventId_userinfo">Next&nbsp; -&nbsp; Info&nbsp; &nbsp;<i class="chevron right icon"></i></button>
		
	</sf:form>

<%@include file="../shared/flows-footer.jsp"%>