package br.com.pub.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
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
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Salvo com sucesso"));
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
		limparUsuario();
		return " ";
	}

}
