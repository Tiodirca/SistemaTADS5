package br.com.pub.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.PessoaFisica;

@SuppressWarnings("deprecation")
@ManagedBean(name ="pessoaFisicaBean")
@SessionScoped
public class PessoaFisicaController implements Serializable{

	private static final long serialVersionUID = 1L;
	PessoaFisica pessoa = new PessoaFisica();
	GenericDAO<PessoaFisica> pessoaFDAO = new GenericDAO<PessoaFisica>();
	public PessoaFisica getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaFisica pessoa) {
		this.pessoa = pessoa;
	}
	
	public String limparUsuario(){
		pessoa = new PessoaFisica();
		return "";
	}
	public String addPessoaFisica(){
		pessoaFDAO.novo(pessoa);
		limparUsuario();
		return "ListPessoaFisica";
	}
	public List<PessoaFisica> listarPessoaFisica(){
		return pessoaFDAO.listarTodos(PessoaFisica.class);
	}
	
	public String delPessoa(PessoaFisica pessoa){
		pessoaFDAO.deletar(pessoa);
		return "ListPessoaFisica";
		
	}
	public String atualizarPessoaFisica(PessoaFisica pessoa){
		pessoaFDAO.alterar(pessoa);
		return "CadPessoaFisica";
	}
	
}
