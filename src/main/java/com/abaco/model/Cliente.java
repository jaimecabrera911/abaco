package com.abaco.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	private String cedula;
	
	@Column(length = 45)
	private String nombre;
	
	@Column(length = 45)
	private String clave;
	
	private String rol;
	
	@Column(length = 45)
	private String telefono;
	
	@OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL)
	private List<Cuenta> cuentas;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", clave=" + clave + ", rol=" + rol + ", telefono="
				+ telefono + "]";
	}

	
	

}
