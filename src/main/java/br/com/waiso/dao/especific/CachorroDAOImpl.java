package br.com.waiso.dao.especific;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.waiso.dao.generic.JpaGenericDao;
import br.com.waiso.entity.Cachorro;

public class CachorroDAOImpl extends JpaGenericDao<Cachorro> implements ICachorroDAO{
	
	@PersistenceContext
	private EntityManager entityManager;
	List<Cachorro> lista;
	
	public CachorroDAOImpl() {
		entityManager = getEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<Cachorro> findEspecific(String s) {
		entityManager = getEntityManager();
		entityManager.getTransaction().begin();
		
		String jpql = "SELECT p FROM Pedido p WHERE p.nome like '%" + s + "%'";
		Query query = entityManager.createQuery(jpql);
		lista = (List<Cachorro>)query.getResultList();
		
		
		entityManager.flush();
		
		entityManager.close();
		if(lista.size() > 0){
			return lista;
		}else{
			return null;
		}
	}
}