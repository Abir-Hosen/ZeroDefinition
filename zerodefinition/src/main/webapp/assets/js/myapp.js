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

});



