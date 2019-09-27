<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@include file="../shared/flows-header.jsp"%>
<div>
	<br>
	<br>
	<br>
	<br>
	<br>
</div>
<div class="ui icon message">
	<i aria-hidden="true" class="circle notched loading icon"></i>
	<div class="header">Welcome to Zero Definition</div>
	<br>
</div>
<div class="ui message">
	<ul>
		<li>You can now have cover images on blog pages.
		<li>Drafts will now auto-save while writing.
		<li>We are fetching that content for you.
		<li>Get the best news in your e-mail every day.
		<li>This is a special notification which you can dismiss.
	</ul>
</div>
<div class="ui message">
	<div class="ui warning bottom attached message">
		<i aria-hidden="true" class="help icon"></i> Already signed up? <a
			href="${contextRoot}/login">Login here</a> instead.
	</div>
</div>

<%@include file="../shared/flows-footer.jsp"%>