package br.com.pub.model;

import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Cliente {
	private int CNPJ;
	private String IE;
public int getCNPJ() {
	return CNPJ;
}
public void setCNPJ(int cNPJ) {
	CNPJ = cNPJ;
}
public String getIE() {
	return IE;
}
public void setIE(String iE) {
	IE = iE;
}
 
}
