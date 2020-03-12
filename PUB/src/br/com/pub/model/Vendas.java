package br.com.pub.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private LocalDate data;

	private double totalVendas;

	@ManyToOne
	@Cascade({ CascadeType.PERSIST,CascadeType.REMOVE})
	private Mesa mesa;

	@OneToOne
	@Cascade({ CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE})
	private Cliente cliente;

	private LocalTime hora;

	@OneToMany
	@Cascade({ CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE})
	private List<ItensVendas> itensVendas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItensVendas> getItensVendas() {
		return itensVendas;
	}

	public void setItensVendas(List<ItensVendas> itensVendas) {
		this.itensVendas = itensVendas;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
}
