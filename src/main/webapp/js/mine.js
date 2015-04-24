$( document ).ready(function() {
	$.ajax({
		method: "POST",
		url: "Controller",
		data: { name: "John", location: "Boston" }
	}).done(function( msg ) {
		debugger;
	    alert( "Mensagem: " + msg );
	});
	
});