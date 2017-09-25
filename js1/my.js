var k = jQuery.noConflict();
k(document).ready( function() {  
	
	if (k(".container").height() < 500 ) { 
		
		k(".container").height(400);
	} 

});