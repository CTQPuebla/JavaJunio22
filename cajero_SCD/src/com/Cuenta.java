package com;

public class Cuenta {
	
	private Persona propie;
	private String fechaCrea;
	private String fechaExp;
	private String cuenta;
	//private String CVV;
	private String pin;
	
	
	
	public Cuenta() {
		super();
	}
	public Cuenta(Persona propie, String fechaCrea, String fechaExp, String cuenta, String pin) {
		super();
		this.propie = propie;
		this.fechaCrea = fechaCrea;
		this.fechaExp = fechaExp;
		this.cuenta = cuenta;
		this.pin = pin;
	}
	public Persona getPropie() {
		return propie;
	}
	public void setPropie(Persona propie) {
		this.propie = propie;
	}
	public String getFechaCrea() {
		return fechaCrea;
	}
	public void setFechaCrea(String fechaCrea) {
		this.fechaCrea = fechaCrea;
	}
	public String getFechaExp() {
		return fechaExp;
	}
	public void setFechaExp(String fechaExp) {
		this.fechaExp = fechaExp;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
}