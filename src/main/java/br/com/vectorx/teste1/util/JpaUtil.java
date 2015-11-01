package br.com.vectorx.teste1.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste1");

    public EntityManager getEntityManager(){
    	return factory.createEntityManager();
    }
}
