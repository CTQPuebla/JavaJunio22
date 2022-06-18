package com;

public class Moneda {
	private String tipo;
	private double denominacion;
	private int cantidad;
	
	
	
	public Moneda(String tipo, double denominacion, int cantidad) {
		super();
		this.tipo = tipo;
		this.denominacion = denominacion;
		this.cantidad = cantidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(double denominacion) {
		this.denominacion = denominacion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "\n Moneda [tipo=" + tipo + ", denominacion=" + denominacion + ", cantidad=" + cantidad + "]\n";
	}
	
	
	
	
}
