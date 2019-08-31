<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@include file="../shared/flows-header.jsp"%>

	<sf:form class="ui form" method="POST" id="registerForm" modelAttribute="user">
		<div class="field">
			<label>Email</label>
			<sf:input type="text" path="email" placeholder="Email"></sf:input>
		</div>
		<div class="field">
			<label>Password</label>
			<sf:input type="password" path="" placeholder="Enter Password"></sf:input>
		</div>
		<br>
		<button class="ui button" name="_eventId_">Login &nbsp;&nbsp;&nbsp;<i class="terminal icon"></i></button>
		
	</sf:form>


<%@include file="../shared/flows-footer.jsp"%>