package br.com.pub.controller;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Produto;

@SuppressWarnings("deprecation")
@ManagedBean(name ="ProdutoBean")
@SessionScoped
public class ProdutoController implements Serializable{

	private static final long serialVersionUID = 1L;
	Produto produto = new Produto();
	GenericDAO<Produto> produtoDAO = new GenericDAO<Produto>();
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public void limparDados(){
		produto = new Produto();
	}
	public String addProduto(){
		produtoDAO.novo(produto);
		limparDados();
		return "ListProdutos";
		
	}
	public List<Produto> listarProdutos(){
		return produtoDAO.listarTodos(Produto.class);
	}
	
	public String delProduto(){
		produtoDAO.deletar(produto);
		return "ListProdutos";
	}
	
}
