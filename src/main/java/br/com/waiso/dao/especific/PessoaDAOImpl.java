package br.com.waiso.dao.especific;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.waiso.dao.generic.JpaGenericDao;
import br.com.waiso.entity.PessoaEntity;

public class PessoaDAOImpl extends JpaGenericDao<PessoaEntity> implements IPessoaDAO{
	
	@PersistenceContext
	private EntityManager entityManager;

	public PessoaDAOImpl() {
		entityManager = getEntityManager();
	}
	
	
}