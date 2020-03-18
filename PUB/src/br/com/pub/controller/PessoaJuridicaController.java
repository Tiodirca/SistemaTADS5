package br.com.pub.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.PessoaJuridica;

@SuppressWarnings("deprecation")
@ManagedBean(name = "pessoaJuridicaBean")
@SessionScoped
public class PessoaJuridicaController implements Serializable {

	private static final long serialVersionUID = 1L;
	PessoaJuridica pessoaJ = new PessoaJuridica();
	GenericDAO<PessoaJuridica> pessoaJDAO = new GenericDAO<PessoaJuridica>();

	public PessoaJuridica getPessoaJ() {
		return pessoaJ;
	}

	public void setPessoaJ(PessoaJuridica pessoaJ) {
		this.pessoaJ = pessoaJ;
	}

	public String limparUsuario() {
		pessoaJ = new PessoaJuridica();
		return "";
	}

	public String addPessoaJudica() {
		pessoaJDAO.novo(pessoaJ);
		limparUsuario();
		return "ListPessoaJuridica";
	}
	public List<PessoaJuridica> listarPessoaJuridica(){
		return pessoaJDAO.listarTodos(PessoaJuridica.class);
	}
	
	public String delPessoaJuridica(PessoaJuridica pessoaJ){
		pessoaJDAO.deletar(pessoaJ);
		return "sucesso";
		
	}
	public String atualizarPessoaJuridica(){
		pessoaJDAO.alterar(pessoaJ);
		return "";
	}

}
