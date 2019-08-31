<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<%@include file="../shared/flows-header.jsp"%>
<br><br>
<div class="ui segment content">
	<div class="ui two column very relaxed grid">
		<div class="column">
			<h4>${registerModel.user.name}</h4><br>
			<p>Email: ${registerModel.user.email}</p>
			<br>
			<a href="${flowExecutionUrl}&_eventId_userinfo">
			<button class="ui button">
				Edit&nbsp; -&nbsp;  User Info&nbsp; &nbsp;<i
					class="chevron up icon"></i>
			</button>
			</a>
		</div>
		<div class="column">
			<p>Email: ${registerModel.userinfo.address}</p><br>
			<p>Email: ${registerModel.userinfo.work}</p><br>
			<p>Email: ${registerModel.user.birth}</p><br>
			<p>Email: ${registerModel.user.mobile}</p>
			<br>
			<a href="${flowExecutionUrl}&_eventId_personal">
			<button class="ui button">
				Edit&nbsp; -&nbsp; User&nbsp; &nbsp;<i
					class="chevron up icon"></i>
			</button>
			</a>
		</div>
	</div>
	<div class="ui vertical divider">and</div>
</div><br><br>
<%-- <div class="ui grid">

	<div class="ui row content">

		<div class="ui eight wide column">
			<div class="ui row">
				<div class="ui column">
					<p style="text-align: center; font-size:140%;">
						Zero Definition Entertainments Pvt. Ltd.<br> 
						Noakhali Science & Technology University<br> 
						Sonapur, Maijdee court, Noakhali<br>
					</p>
				</div>
			</div><br>
			<a href="${flowExecutionUrl}&_eventId_personal">
			<button class="ui button">
				Edit&nbsp; -&nbsp; User&nbsp; &nbsp;<i
					class="chevron up icon"></i>
			</button>
			</a>
		</div>

		<div class="ui eight wide column">
			<div class="ui row">
				<div class="ui column">
					<p style="text-align: center; font-size:140%;">
						Zero Definition Entertainments Pvt. Ltd.<br> 
						Noakhali Science & Technology University<br> 
						Sonapur, Maijdee court, Noakhali<br>
					</p>
				</div>
			</div><br>
			<a href="${flowExecutionUrl}&_eventId_userinfo">
			<button class="ui button">
				Edit&nbsp; -&nbsp;  User Info&nbsp; &nbsp;<i
					class="chevron up icon"></i>
			</button>
			</a>
		</div>
		
	</div>

</div> --%>

<div><br><br></div>
<a href="${flowExecutionUrl}&_eventId_submit">
<button class="ui button">
	Next&nbsp; -&nbsp; Submit&nbsp; &nbsp;<i
		class="chevron right icon"></i>
</button>
</a>
<%@include file="../shared/flows-footer.jsp"%>

