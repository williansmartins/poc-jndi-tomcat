package br.com.waiso.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.waiso.dao.especific.PessoaDAOImpl;
import br.com.waiso.dao.generic.JpaGenericDao;
import br.com.waiso.entity.PessoaEntity;

public class PessoaDAOTest {

	JpaGenericDao<PessoaEntity> dao = new PessoaDAOImpl();
	
	@Test
	public void inserirPessoa() {
		PessoaEntity pessoaMockada = new PessoaMassa().popularPessoa();
		dao.insert(pessoaMockada);
		Assert.assertTrue(pessoaMockada.getId() != null);
	}

}
