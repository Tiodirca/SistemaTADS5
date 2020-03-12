package br.com.pub.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Usuario;

@SuppressWarnings("deprecation")
@ManagedBean(name ="UsuarioBean")
@SessionScoped
public class usuarioController implements Serializable{

	private static final long serialVersionUID = 1L;
	Usuario usuario = new Usuario();
	GenericDAO<Usuario> usuarioDAO = new GenericDAO<Usuario>();
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String limparDados(){
		usuario = new Usuario();
		return "";
	}
	public String addUsuario(){
		usuarioDAO.novo(usuario);
		FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Salvo com sucesso"));
		
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
		limparDados();
		return " ";
	}
	
}
