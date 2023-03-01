package com.example.demo.persona.web.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="persona")

public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_per")//generarlo como secuencia
	@SequenceGenerator(name = "seq_per", sequenceName = "seq_per", allocationSize = 1)
	@Column(name="per_id")
	private Integer id;
	
	@Column(name="per_nombre")
	private String nombre;
	
	@Column(name="per_cedula")
	private String cedula;
	
	@Column(name="per_apellido")
	private String apellido;
	
	@Column(name="per_genero")
	private String genero;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", apellido=" + apellido
				+ ", genero=" + genero + "]";
	}
	
	
	
	

}
