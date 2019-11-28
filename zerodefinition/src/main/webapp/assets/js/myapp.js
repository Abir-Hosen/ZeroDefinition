$(function(){

	switch(menu){
	case 'Home':
		$('#home').addClass('active');
		break;
	case 'Our Story':
		$('#story').addClass('active');
		break;
	case 'The Team':
		$('#team').addClass('active');
		break;
	case 'Movies':
		$('#movies').addClass('active');
		break;
	case 'News':
		$('#news').addClass('active');
		break;
	case 'Blog':
		$('#blog').addClass('active');
		break;
	case 'Connect':
		$('#connect').addClass('active');
		break;
	case 'Login':
		$('#login').addClass('active');
		break;
	case 'Sign Up':
		$('#signup').addClass('active');
		break;
	}

	$('.dropdown').dropdown();

	$('.special.cards .image').dimmer({
		  on: 'hover'
		});

	$('.ui.modal').modal("show");
	
	// for handling CSRF token
	var token = $('meta[name="_csrf"]').attr('content');
	var header = $('meta[name="_csrf_header"]').attr('content');
	
	if((token!=undefined && header !=undefined) && (token.length > 0 && header.length > 0)) {		
		// set the token header for the ajax request
		$(document).ajaxSend(function(e, xhr, options) {			
			xhr.setRequestHeader(header,token);			
		});				
	}
	
	var myIndex = 0;
	carousel();

	function carousel() {
	  var i;
	  var x = document.getElementsByClassName("mySlides");
	  for (i = 0; i < x.length; i++) {
	    x[i].style.display = "none";  
	  }
	  myIndex++;
	  if (myIndex > x.length) {myIndex = 1}    
	  x[myIndex-1].style.display = "block";  
	  setTimeout(carousel, 3000); // Change image every 3 seconds
	}

});

(function(d, s, id) {
    var js, fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v3.0";
    fjs.parentNode.insertBefore(js, fjs);
  }(document, 'script', 'facebook-jssdk'));



