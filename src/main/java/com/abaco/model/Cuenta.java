package com.abaco.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "cuentas")
public class Cuenta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String numeroCuenta;

	@Column(length = 45)
	private Double saldo;

	@CreationTimestamp
	private Date fecha;

	@Column(nullable = false)
	private boolean estado;

	@ManyToOne(fetch = FetchType.LAZY)
	private Cliente cliente;

	@OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
	private List<PruebaCuenta> pruebaCuentas;

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numCuenta) {
		this.numeroCuenta = numCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<PruebaCuenta> getPruebaCuentas() {
		return pruebaCuentas;
	}

	public void setPruebaCuentas(List<PruebaCuenta> pruebaCuentas) {
		this.pruebaCuentas = pruebaCuentas;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", fecha=" + fecha + ", estado=" + estado
				+ ", cliente=" + cliente + "]";
	}

}
