<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@include file="../shared/flows-header.jsp"%>
<br><br>
<div class="ui segment content" style="background-color: #192a44;">
	<div class="ui two column very relaxed grid">
		<div class="column">
			<h4 style="color: white;">${registerModel.user.name}</h4><br>
			<p>Email: ${registerModel.user.email}</p>
			<br><br><br><br><br><br><br>
			<a href="${flowExecutionUrl}&_eventId_personal">
			<button class="ui button">
				Edit&nbsp; -&nbsp;  User Info&nbsp; &nbsp;<i
					class="chevron up icon"></i>
			</button>
			</a>
		</div>
		<div class="column">
			<p>Address: ${registerModel.userinfo.address}</p><br>
			<p>Work: ${registerModel.userinfo.work}</p><br>
			<p>Birthday: ${registerModel.userinfo.birth}</p><br>
			<p>Mobile: ${registerModel.userinfo.mobile}</p>
			<br>
			<a href="${flowExecutionUrl}&_eventId_userinfo">
			<button class="ui button">
				Edit&nbsp; -&nbsp; User&nbsp; &nbsp;<i
					class="chevron up icon"></i>
			</button>
			</a>
		</div>
	</div>
	<div class="ui vertical divider">and</div>
</div><br><br>

<div><br></div>
<a href="${flowExecutionUrl}&_eventId_submit" class="ui button">confirm</a><div><br><br><br></div>
<%@include file="../shared/flows-footer.jsp"%>

