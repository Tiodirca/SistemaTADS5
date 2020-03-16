package br.com.pub.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Usuario;


@SuppressWarnings("deprecation")
@ManagedBean(name ="LoginBean")
@SessionScoped
public class LoginController implements Serializable{

	private static final long serialVersionUID = 1L;

	Usuario user = new Usuario();
	GenericDAO<Usuario> userDAO = new GenericDAO<>();
	
	
	public String fazerLogin(String login,String senha){
		return senha;
	}
}

