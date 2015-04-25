$( document ).ready(function() {
	
	$("#botao").click(function(){
		$.ajax({
			method: "POST",
			url: "Controller",
			data: { nome: $("#nome").val(), idade: $("#idade").val(), sexo: $("input[name='sexo']").val() }
		}).done(function( retorno ) {
			debugger;
			alert( "Mensagem: " + retorno.nome );
		});
	});
	
	
});