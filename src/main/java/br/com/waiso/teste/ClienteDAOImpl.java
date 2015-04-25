package br.com.waiso.teste;

import br.com.waiso.dao.especific.IClienteDAO;
import br.com.waiso.dao.generic.JpaGenericDao;
import br.com.waiso.entity.ClienteEntity;

public class ClienteDAOImpl extends JpaGenericDao<ClienteEntity> implements IClienteDAO{

}
