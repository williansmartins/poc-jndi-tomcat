package br.com.waiso.dao.especific;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.waiso.dao.generic.JpaGenericDao;
import br.com.waiso.entity.PessoaEntity;

public class PessoaDAOImpl extends JpaGenericDao<PessoaEntity> implements IPessoaDAO{
	
	@PersistenceContext
	private EntityManager entityManager;
	List<PessoaEntity> lista;
	
	public PessoaDAOImpl() {
		entityManager = getEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<PessoaEntity> findEspecific(String s) {
		entityManager = getEntityManager();
		entityManager.getTransaction().begin();
		
		String jpql = "SELECT p FROM Pedido p WHERE p.nome like '%" + s + "%'";
		Query query = entityManager.createQuery(jpql);
		lista = (List<PessoaEntity>)query.getResultList();
		
		
		entityManager.flush();
		
		entityManager.close();
		if(lista.size() > 0){
			return lista;
		}else{
			return null;
		}
	}
}