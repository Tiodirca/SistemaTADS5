package br.com.pub.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Cliente extends Pessoa{
	
	private LocalDate dataCadastro;

public LocalDate getDataCadastro() {
	return dataCadastro;
}

public void setDataCadastro(LocalDate dataCadastro) {
	this.dataCadastro = dataCadastro;
}
}
