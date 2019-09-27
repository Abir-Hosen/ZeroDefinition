<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<!-- Alert -->
<c:if test="${not empty message}">	
<div class="ui container">
	<div class="ui basic modal">
		<div class="header">
			Note:
		</div>
		<div class="content">
			<p>${message} </p>
		</div>
		<div class="actions">
			<div class="ui green approve button">Approve</div>
		</div>
	</div>
</div>
</c:if>
<!-- Alert -->

<div class="ui grid">

	<!-- Page Title -->
	<div class="ui row">
		<div class="ui sixteen wide column">
			<h1 id="page-title" class="script">
				<span id="u">${title}</span>
			</h1>
		</div>
	</div>
	<!-- Finished -->

	<!-- Address -->
	<div class="ui row">
		<div class="ui sixteen wide column">
			<p style="text-align: center; font-size:140%;">
				Zero Definition Entertainments Pvt. Ltd.<br> Noakhali Science & Technology University
				<br> Sonapur, Maijdee court, Noakhali<br>
			</p>
		</div>
	</div>
	<!-- Finished -->

	<div class="ui row content">

		<!-- Google Map -->
		<div class="ui eight wide column">
			<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3678.2582916705746!2d91.09814261446618!3d22.792891230593877!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3754af712aaac0b7%3A0x4bab3d112f6b6f3f!2sNoakhali%20Science%20and%20Technology%20University!5e0!3m2!1sen!2sbd!4v1569620321377!5m2!1sen!2sbd" width="600" height="410" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
		</div>
		<!-- Finished -->

		<!-- Sent Message -->
		<div class="ui four wide column">
			<!-- Form Option -->
			<sf:form class="ui form" modelAttribute="connect"
				action="${contextRoot}/connect" method="POST">
				<!-- Selection Option -->
				<sf:select class="ui fluid dropdown" path="enqId"
					items="${enquery }"
					itemLabel="name"
					itemValue="id"
					/>
				<!-- Finished -->
				<br>
				<div class="field">
					<sf:input type="text" path="name"
						placeholder="Full Name"></sf:input>
<%-- 					<sf:errors path="name" cssClass="error" element="em"></sf:errors>
 --%>				</div>
				<div class="field">
					<sf:input type="text" path="email"
						placeholder="Email"></sf:input>
<%-- 					<sf:errors path="email" cssClass="error" element="em"></sf:errors>
 --%>				</div>
				<div class="field">
					<sf:input type="number" path="contact"
						placeholder="Phone Number"></sf:input>
<%-- 					<sf:errors path="contact" cssClass="error" element="em"></sf:errors>
 --%>				</div>
				<div class="field">
					<sf:input type="text" path="state"
						placeholder="State"></sf:input>
<%-- 					<sf:errors path="state" cssClass="error" element="em"></sf:errors>
 --%>				</div>
				<div class="field">
					<sf:textarea rows="3" cols="4" path="comment" placeholder="Comment" ></sf:textarea>
<%-- 					<sf:errors path="comment" cssClass="error" element="em"></sf:errors>
 --%>				</div>
				
				<sf:hidden path="active"/>
				
				<button class="ui button" type="submit">Submit</button>
			</sf:form>
			<!-- Finished Form -->

		</div>
		<!-- Finished -->

		<!-- Contact Link -->
		<div class="ui four wide column line" id="link">
			<div class="ui row">
				<i class="simplybuilt icon"></i><br> BUSINESS ENQUERY<br>
				<a style="color: red;" href="#">business@zerodefinition.com</a>
			</div>
			<div class="ui row">
				<i class="handshake icon"></i><br> WORK WITH US<br> <a
					style="color: red;" href="#">work@zerodefinition.com</a>
			</div>
			<div class="ui row">
				<i class="newspaper icon"></i><br> PRESS ENQUERY<br> <a
					style="color: red;" href="#">press@zerodefinition.com</a>
			</div>
			<div class="ui row">
				<i class="archive icon"></i><br> CREATIVE ENQUERY<br> <a
					style="color: red;" href="#">creative@zerodefinition.com</a>
			</div>
			<div class="ui row">
				<i class="industry icon"></i><br> MARKETING<br> <a
					style="color: red;" href="#">marketing@zerodefinition.com</a>
			</div>
		</div>
		<!-- Finished -->
	</div>


	<!-- Open Google Map -->
	<div class="ui row" id="link">
		<div class="ui eight wide column">
			<a style="color: white;" href="https://www.google.com.bd/maps/place/Noakhali+Science+and+
			Technology+University/@22.7928912,91.0981426,17z/data=!3m1!4b1!4m5!3m4!1s0x3754af712aaac0
			b7:0x4bab3d112f6b6f3f!8m2!3d22.7928863!4d91.1003313?hl=en" 
			target="_blank">Open on google maps</a>
		</div>
	</div>
	
	<!-- Finished -->

</div><br>
	<br>
	<br>
	<br>