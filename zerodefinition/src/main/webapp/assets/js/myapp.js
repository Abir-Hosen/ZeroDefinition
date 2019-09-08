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
	}

	$('.dropdown').dropdown();

	$('.special.cards .image').dimmer({
		  on: 'hover'
		});

	$('.ui.modal').modal("show");
	

});



