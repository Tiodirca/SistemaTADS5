package br.com.pub.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Cliente;
import br.com.pub.model.ItensVendas;
import br.com.pub.model.Mesa;
import br.com.pub.model.Vendas;

@SuppressWarnings("deprecation")
@ManagedBean(name ="VendasBean")
@SessionScoped
public class VendasController implements Serializable{

	private static final long serialVersionUID = 1L;
	Vendas vendas = new Vendas();
	List<ItensVendas> itensVendas;
	Cliente cliente = new Cliente();
	Mesa mesa = new Mesa();
	GenericDAO<Vendas> vendasDAO = new GenericDAO<Vendas>();


	public Vendas getVendas() {
		return vendas;
	}

	public void setVendas(Vendas vendas) {
		this.vendas = vendas;
	}

	public List<ItensVendas> getItensVendas() {
		return itensVendas;
	}

	public void setItensVendas(List<ItensVendas> itensVendas) {
		this.itensVendas = itensVendas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public String limparDados(){
		vendas = new Vendas();
		return "";
	}
	
	public String addVendas(){
		vendas.setItensVendas(itensVendas);
		vendas.setMesa(mesa);
		vendas.setCliente(cliente);
		vendasDAO.novo(vendas);	
		limparDados();
		return "ListVendas";
	}
	public List<Vendas> listarVendas(){
		return vendasDAO.listarTodos(Vendas.class);
	}
	public String delVendas(Vendas vendas){
		vendasDAO.deletar(vendas);
		return "sucesso";
		
	}
	public String atualizarVendas(){
		vendasDAO.alterar(vendas);
		return "sucesso";
	}
	
}

