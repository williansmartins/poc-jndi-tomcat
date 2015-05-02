package br.com.waiso.teste;

import br.com.waiso.entity.Cachorro;

public class CachorroMassa {
	
	Cachorro cachorroMassa(){
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Cadu");
		cachorro.setRaca("Pastor-alemão");
		cachorro.setTamanho(65.5);
		cachorro.setIdade(9);
		cachorro.setSexo('M');
		return cachorro;
	}
}
