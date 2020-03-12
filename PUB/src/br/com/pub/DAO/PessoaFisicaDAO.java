package br.com.pub.DAO;

import java.time.LocalDate;
import br.com.pub.jpaUtil.GenericDAO;
import br.com.pub.model.PessoaFisica;

public class PessoaFisicaDAO {
	PessoaFisica pessoaf = new PessoaFisica();
	GenericDAO<PessoaFisica> pessoaFDAO = new GenericDAO<PessoaFisica>();
	public void addPessoa(){
        
        pessoaf.setNome("DarkSIDE");
        pessoaf.setEndereco("teste123");
        pessoaf.setTelefone("67997141931");
        pessoaf.setDataNasc(LocalDate.now());
        pessoaf.setDataCadastro(LocalDate.now());
        pessoaf.setCPF(0000000);
        pessoaf.setRG(11111111);
        pessoaFDAO.novo(pessoaf);
	}
}
