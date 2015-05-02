package br.com.waiso.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.waiso.dao.especific.CachorroDAOImpl;
import br.com.waiso.dao.generic.JpaGenericDao;
import br.com.waiso.entity.Cachorro;

public class CachorroDAOTest {

	JpaGenericDao<Cachorro> dao = new CachorroDAOImpl();
	
	@Test
	public void inserirCachorro() {
		Cachorro cachorroMockada = new CachorroMassa().cachorroMassa();
		dao.insert(cachorroMockada);
		Assert.assertTrue(cachorroMockada.getId() != null);
	}

}
