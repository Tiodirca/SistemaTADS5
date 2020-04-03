package br.com.pub.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Mesa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int numero;
	private Boolean status;
	
	
	@OneToMany
	@Cascade({ CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE})
	private List<ItensVendas> itensVendas;

	public List<ItensVendas> getItensVendas() {
		return itensVendas;
	}
	public void setItensVendas(List<ItensVendas> itensVendas) {
		this.itensVendas = itensVendas;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
}
