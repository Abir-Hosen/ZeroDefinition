<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@include file="../shared/flows-header.jsp"%>

	<sf:form class="ui form" method="POST" id="registerForm" modelAttribute="userinfo">
		<div class="field">
			<label>Address</label> 
			<sf:input type="text" path="address" placeholder="Address"></sf:input>
		</div>
		<div class="field">
			<label>Work</label> 
			<sf:input type="text" path="work" placeholder="Work"></sf:input>
		</div>
		<div class="field">
			 <label>Birth Date</label>
	     	<sf:input type="date" path="birth"></sf:input>
	    </div>
		<div class="field">
			<label>Country</label>
			<sf:input type="text" path="country" placeholder="Country"></sf:input>
		</div>
		<div class="field">
			<label>Mobile</label>
			<sf:input type="number" path="mobile" placeholder="Mobile"></sf:input>
		</div>
		<div class="field">
			<label>About</label>
			<sf:textarea rows="3" cols="4" path="about" placeholder="About"></sf:textarea>
		</div>
		<div class="field">
			<label>Blood</label>
			<sf:input type="text" path="blood" placeholder="Blood"></sf:input>
		</div>
		<sf:hidden path="date"/>
		<br>
		<button class="ui button" name="_eventId_personal"><i class="chevron left icon"></i>Previous&nbsp; -&nbsp;Info&nbsp; &nbsp;</button>
		<button class="ui button" name="_eventId_confirm">Next&nbsp; -&nbsp; Confirm&nbsp; &nbsp;<i class="chevron right icon"></i></button>

	</sf:form>
<br><br>

<%@include file="../shared/flows-footer.jsp"%>

