package br.com.pub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
public class ItensVendas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
private long id;
	
private int qto;
 
 @ManyToOne
 @Cascade({CascadeType.ALL})
 private Produto produto;
 
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getQto() {
	return qto;
}
public void setQto(int qto) {
	this.qto = qto;
}
public Produto getProduto() {
	return produto;
}
public void setProduto(Produto produto) {
	this.produto = produto;
}
}
