package br.tp1.gabriela.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Repository<T> {
	
	private EntityManager entityManager = null;
	
	public EntityManager getEntityManager() {
		if (entityManager == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("GabrielaA1");
			entityManager = emf.createEntityManager();
		}
		return entityManager;
	}
	
	public void salvar(T obj) {
		getEntityManager().getTransaction().begin();
		getEntityManager().merge(obj);
		getEntityManager().getTransaction().commit();
	}
	
	public void deletar(T obj) {
		if (obj != null) {
			getEntityManager().getTransaction().begin();
			getEntityManager().remove(getEntityManager().merge(obj));
			getEntityManager().getTransaction().commit();
		}

	}

}
