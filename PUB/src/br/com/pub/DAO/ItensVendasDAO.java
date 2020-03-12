package br.com.pub.DAO;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.ItensVendas;
import br.com.pub.model.Produto;

public class ItensVendasDAO {
	ItensVendas item = new ItensVendas();
	GenericDAO<ItensVendas> itemDAO = new GenericDAO<ItensVendas>();
	Produto produto = new Produto();
	
	public void addItem(){
		item.setProduto(produto);
		item.setQto(21312);
		itemDAO.novo(item);
	}
}
