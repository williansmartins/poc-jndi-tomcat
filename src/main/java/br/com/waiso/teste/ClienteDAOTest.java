package br.com.waiso.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.waiso.dao.generic.JpaGenericDao;
import br.com.waiso.entity.ClienteEntity;

public class ClienteDAOTest {

	JpaGenericDao<ClienteEntity> dao = new ClienteDAOImpl();
	
	@Test
	public void inserirCliente() {
		ClienteEntity entity = new ClienteEntity();
		entity.setNome("Renan");
		entity.setIdade(21);
		entity.setSexo('M');
		
		dao.insert(entity);
		Assert.assertTrue(entity.getId() != null);
	}

}
