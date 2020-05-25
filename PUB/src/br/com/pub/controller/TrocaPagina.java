package br.com.pub.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.PessoaFisica;
@SuppressWarnings("deprecation")
@ManagedBean(name ="TrocaPagina")
@SessionScoped

public class TrocaPagina implements Serializable {

	private static final long serialVersionUID = 1L;
	
	PessoaFisica pessoa = new PessoaFisica();
	GenericDAO<PessoaFisica> pessoaFDAO = new GenericDAO<PessoaFisica>();
	
	public PessoaFisica getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaFisica pessoa) {
		this.pessoa = pessoa;
	}

	public String listarPessoaFisica(){
		return "ListPessoaFisica";
	}
	public String addPessoaFisica(){
		pessoaFDAO.novo(pessoa);
		return "CadPessoaFisica";
	}
}
