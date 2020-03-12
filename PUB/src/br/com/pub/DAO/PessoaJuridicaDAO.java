package br.com.pub.DAO;

import java.time.LocalDate;

import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.PessoaJuridica;

public class PessoaJuridicaDAO {
	PessoaJuridica pessoaj = new PessoaJuridica();
	GenericDAO<PessoaJuridica> pessoaJDAO = new GenericDAO<PessoaJuridica>();
	public void addPessoaJ(){
        
		pessoaj.setNome("Olafio");
		pessoaj.setTelefone("111111111");
		pessoaj.setDataCadastro(LocalDate.now());
		pessoaj.setDataNasc(LocalDate.now());
		pessoaj.setEndereco("Rua Tiririca");
		pessoaj.setIE("tester");
		pessoaj.setCNPJ(123131231);
		pessoaJDAO.novo(pessoaj);
	}
}
