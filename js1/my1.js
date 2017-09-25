var j = jQuery.noConflict();
j(document).ready( function() {
	
	if (j(".container").height() < 680 ) {
		
		j(".container").height(600);
	}

});