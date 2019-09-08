<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@include file="../shared/flows-header.jsp"%>

	<sf:form class="ui form" method="POST" id="registerForm" modelAttribute="userinfo">
		<div class="field">
			<label>Address</label> 
			<sf:input type="text" path="address" placeholder="Address"></sf:input>
			<sf:errors path="address" class="error" element="em"/>
		</div>
		<div class="field">
			<label>Work</label>
			<sf:input type="text" path="work" placeholder="Work"></sf:input>
			<sf:errors path="work" class="error" element="em"/>
		</div>
		<div class="field">
			<label>Country</label>
			<sf:input type="text" path="country" placeholder="Country"></sf:input>
			<sf:errors path="country" class="error" element="em"/>
		</div>
		<div class="field">
			<label>Mobile</label>
			<sf:input type="number" path="mobile" placeholder="Mobile"></sf:input>
			<sf:errors path="mobile" class="error" element="em"/>
		</div>
<%-- 		<div class="field">
			<label>Birth</label>
			<sf:input type="date" path="birth" placeholder="Birth Date"></sf:input>
		</div> --%>
		<div class="field">
			<label>Blood</label>
			<sf:input type="text" path="blood" placeholder="Blood"></sf:input>
			<sf:errors path="blood" class="error" element="em"/>
		</div>
		<div class="field">
			<label>About</label>
			<sf:input type="text" path="about" placeholder="About"></sf:input>
			<sf:errors path="about" class="error" element="em"/>
		</div>
		<br>
		<button class="ui button" name="_eventId_personal" type="submit"><i class="chevron left icon"></i>Previous&nbsp; -&nbsp; User&nbsp; &nbsp;</button>
		<button class="ui button" name="_eventId_confirm" type="submit">Check&nbsp; -&nbsp; Details&nbsp; &nbsp;<i class="chevron right icon"></i></button>

	</sf:form>
	<br><br>

<%@include file="../shared/flows-footer.jsp"%>

