package br.com.vectorx.teste1.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.vectorx.teste1.dao.ITbanoDao;
import br.com.vectorx.teste1.entidade.Tbano;
import br.com.vectorx.teste1.util.JpaUtil;

public class TbanoDaoImpl implements ITbanoDao{
	
	public TbanoDaoImpl(){
		
	}
	
	public Tbano buscaPorAno(Integer ano) {
		EntityManager manager = new JpaUtil().getEntityManager();
		Query query = manager.createQuery("select tb from Tbano tb where tb.ano=:pAno");
		query.setParameter("pAno", ano);
		
		@SuppressWarnings("unchecked")
		List<Tbano> tbanos = query.getResultList();
		manager.close();
		return tbanos.isEmpty()? null : tbanos.get(0);
	}
}
