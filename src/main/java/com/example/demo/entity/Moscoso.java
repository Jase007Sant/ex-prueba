package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Moscoso implements Serializable{

 private static final long serialVersionUID = 4894729030347835498L;

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String agno; 
 private String fechaMoscoso;

 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn(name="idPersona")//,insertable=false, updatable=false)
 @JsonManagedReference
 private Personal persona;
 
 
 public Moscoso() {
	super();
	// TODO Auto-generated constructor stub
}

public Moscoso(String agno, String fechaMoscoso, Personal persona) {
	super();
	this.agno = agno;
	this.fechaMoscoso = fechaMoscoso;
	this.persona=persona;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getAgno() {
	return agno;
}

public void setAgno(String agno) {
	this.agno = agno;
}

public String getFechaMoscoso() {
	return fechaMoscoso;
}

public void setFechaMoscoso(String fechaMoscoso) {
	this.fechaMoscoso = fechaMoscoso;
}

public Personal getPersona() {
	return persona;
}

public void setPersona(Personal persona) {
	this.persona = persona;
}

/*@Override
public String toString() {
	return "Moscoso [id=" + id + ", agno=" + agno + ", fechaMoscoso=" + fechaMoscoso + "]";
}
*/


}