package br.com.pub.controller;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Usuario;

@SuppressWarnings("deprecation")
@ManagedBean(name ="UsuarioBean")
@SessionScoped
public class UsuarioController implements Serializable{

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
		limparDados();
		return "ListUsuarios";
	}
	public List<Usuario> listarUsuario(){
		return usuarioDAO.listarTodos(Usuario.class);
	}
	
	public String delUsuario(Usuario usuario){
		usuarioDAO.deletar(usuario);
		return "sucesso";
		
	}
	public String atualizarUsuario(){
		usuarioDAO.alterar(usuario);
		return "";
	}
	
}
