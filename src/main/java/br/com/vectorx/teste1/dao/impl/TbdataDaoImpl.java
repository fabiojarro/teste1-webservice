package br.com.vectorx.teste1.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.vectorx.teste1.dao.ITbdataDao;
import br.com.vectorx.teste1.entidade.Tbdata;
import br.com.vectorx.teste1.util.JpaUtil;

public class TbdataDaoImpl implements ITbdataDao {

	public TbdataDaoImpl() {
		
	}
	public Tbdata buscaPorData(Calendar calendar) {		
		
		EntityManager manager = new JpaUtil().getEntityManager();
		
		Query query = manager.createQuery
						("select tb from Tbdata tb where :pData>=tb.datainicio and" +
						" :pData <=tb.datafim");
		
		query.setParameter("pData", calendar);
		
		@SuppressWarnings("unchecked")
		List<Tbdata> tbdata = query.getResultList();
		manager.close();
		return tbdata.isEmpty()? null : tbdata.get(0);
	}
	
	public Tbdata buscaProximoFeriado(Calendar calendar){
		
		EntityManager manager = new JpaUtil().getEntityManager();
	    
		Query query = manager.createQuery
						("select tb from Tbdata tb where tb.datainicio>:pData" +
						" order by tb.datainicio");
		
		query.setParameter("pData", calendar);		
		@SuppressWarnings("unchecked")
		List<Tbdata> tbdata = query.getResultList();
		manager.close();		
		return tbdata.isEmpty()? null : tbdata.get(0);
	}
}
