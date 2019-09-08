<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@include file="../shared/flows-header.jsp"%>

	<sf:form class="ui form" method="POST" id="registerForm" modelAttribute="user">
		<div class="field">
			<label>User Name</label> 
			<sf:input type="text" path="name" placeholder="Full Name"></sf:input>
			<sf:errors path="name" class="error" element="em"/>
		</div>
		<div class="field">
			<label>Email</label>
			<sf:input type="text" path="email" placeholder="Email"></sf:input>
			<sf:errors path="email" class="error" element="em"/>
		</div>
		<div class="field">
			<label>Password</label>
			<sf:input type="password" path="password" placeholder="Enter Password"></sf:input>
			<sf:errors path="password" class="error" element="em"/>
		</div>
		<div class="field">
			<label>Confirm Password</label>
			<sf:input type="password" path="confirmPassword" placeholder="Re-enter Password"></sf:input>
			<sf:errors path="confirmPassword" class="error" element="em"/>
		</div>
		<sf:hidden path="allowance"/>
		<sf:hidden path="active"/>
		<br>
		<button class="ui button" name="_eventId_userinfo" type="submit">Next&nbsp; -&nbsp; Info&nbsp; &nbsp;<i class="chevron right icon"></i></button>
	</sf:form>

<%@include file="../shared/flows-footer.jsp"%>