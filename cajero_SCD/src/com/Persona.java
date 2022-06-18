package com;

public class Persona {
	private String nombre;
	private String a_paterno;
	private String a_materno;
	private int edad;
	private String sexo;
	
	
	public Persona(String nombre, String a_paterno, String a_materno, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.a_paterno = a_paterno;
		this.a_materno = a_materno;
		this.edad = edad;
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getA_paterno() {
		return a_paterno;
	}
	public void setA_paterno(String a_paterno) {
		this.a_paterno = a_paterno;
	}
	public String getA_materno() {
		return a_materno;
	}
	public void setA_materno(String a_materno) {
		this.a_materno = a_materno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
