package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Personal implements Serializable{

 private static final long serialVersionUID = 4894729030347835498L;

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 //@Column(name = "id", nullable = false, updatable = false)
 private Long id;
 private String expediente; 
 private String nombre;
 private String apellidos;
 private String cargo;
 private String fechaAlta;
 
 @OneToMany(mappedBy="persona")//, fetch = FetchType.LAZY, orphanRemoval = true)
 @JsonBackReference
 private List<Moscoso> listadoMoscosos;

 public Personal() {
	super();
	// TODO Auto-generated constructor stub
 }
 
 public Personal(String expediente, String nombre, String apellidos, String cargo, String fechaAlta) {
	super();
	this.expediente = expediente;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.cargo = cargo;
	this.fechaAlta = fechaAlta;
 }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getExpediente() {
	return expediente;
}

public void setExpediente(String expediente) {
	this.expediente = expediente;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public String getCargo() {
	return cargo;
}

public void setCargo(String cargo) {
	this.cargo = cargo;
}

public String getFechaAlta() {
	return fechaAlta;
}

public void setFechaAlta(String fechaAlta) {
	this.fechaAlta = fechaAlta;
}

public List<Moscoso> getListadoMoscosos() {
	return listadoMoscosos;
}

public void setListadoMoscosos(List<Moscoso> listadoMoscosos) {
	this.listadoMoscosos = listadoMoscosos;
}

public void agregarMoscoso(Moscoso moscoso) {
	listadoMoscosos.add(moscoso);
}

}