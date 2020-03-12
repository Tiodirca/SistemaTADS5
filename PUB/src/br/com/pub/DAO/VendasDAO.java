package br.com.pub.DAO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Cliente;
import br.com.pub.model.ItensVendas;
import br.com.pub.model.Mesa;
import br.com.pub.model.Vendas;

public class VendasDAO {

	Vendas venda = new Vendas();
	GenericDAO<Vendas> vendasDAO = new GenericDAO<Vendas>();
	List<ItensVendas> itensVendas;
	Cliente cliente = new Cliente();
	Mesa mesa = new Mesa();
	public void addVendas(){
		venda.setCliente(cliente);
		venda.setData(LocalDate.now());
		venda.setHora(LocalTime.now());
		venda.setMesa(mesa);
		venda.setItensVendas(itensVendas);
		venda.setTotalVendas(232313);
		vendasDAO.novo(venda);
	}
}
