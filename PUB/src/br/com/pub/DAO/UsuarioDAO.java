package br.com.pub.DAO;

import java.time.LocalDate;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.Usuario;

public class UsuarioDAO {
	Usuario usuario = new Usuario();
	GenericDAO<Usuario> usuarioDAO = new GenericDAO<Usuario>();
	
	public void addUsuario(){
		usuario.setNome("User");
		usuario.setTelefone("679999999");
		usuario.setEndereco("Rua das Marias");
		usuario.setDataNasc(LocalDate.now());
		usuario.setLogin("Tiodirca");
		usuario.setSenha("Abril21");
		usuarioDAO.novo(usuario);
	}
}
