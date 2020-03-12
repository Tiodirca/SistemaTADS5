package br.com.pub.jpaUtil;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GenericDAO<E> implements IGenericDAO<E>, Serializable {
	

	private static final long serialVersionUID = 1L;
	EntityManager em;
	
	public GenericDAO(){
		final EntityManagerFactory factory = Persistence.createEntityManagerFactory("sys_restaurante");
        em = factory.createEntityManager();
	}
	
	public void novo( final E entidade) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entidade);
		et.commit();
		//em.close();
	}

	@Override
	public void alterar(final E entidade) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(entidade);
		et.commit();
		//em.close();
		
	}

	@Override
	public void deletar(final E entidade) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(entidade);
		et.commit();
		//em.close();
	}

	@Override
	public List<E> listarTodos(Class<E> entidade) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		@SuppressWarnings("unchecked")
		List<E> retorno = em.createQuery("from " + entidade.getName()).getResultList();
		et.commit();
		//em.close();
		return retorno;
	}

}
