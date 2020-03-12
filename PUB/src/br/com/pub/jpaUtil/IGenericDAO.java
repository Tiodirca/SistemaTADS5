package br.com.pub.jpaUtil;

import java.util.List;

public interface IGenericDAO<E> {

	public void novo(E entidade);
	
	public void alterar(E entidade);
	
	public void deletar(E entidade);
	
	public List<E> listarTodos(Class<E> entidade);
}
