package br.com.waiso.teste;

import br.com.waiso.entity.PessoaEntity;

public class PessoaMassa {
	
	PessoaEntity popularPessoa(){
		PessoaEntity pessoa = new PessoaEntity();
		pessoa.setNome("Willians Martins");
		pessoa.setIdade(32);
		pessoa.setSexo('M');
		return pessoa;
	}
}
