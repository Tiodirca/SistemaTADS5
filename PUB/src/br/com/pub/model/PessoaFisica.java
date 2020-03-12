package br.com.pub.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class PessoaFisica extends Cliente{
	private int CPF;
	private int RG;
public int getCPF() {
	return CPF;
}
public void setCPF(int cPF) {
	CPF = cPF;
}
public int getRG() {
	return RG;
}
public void setRG(int rG) {
	RG = rG;
}
}
