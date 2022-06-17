package com;

import java.util.Date;

public class Ticket {
	Date fechahora;
	String lugar;
	String cajero;
	String tarjeta;
	String  movimiento;
	double saldofin;
	public Ticket(Date fechahora, String lugar, String cajero, String tarjeta, String movimiento, double d) {
		super();
		this.fechahora = fechahora;
		this.lugar = lugar;
		this.cajero = cajero;
		this.tarjeta = tarjeta;
		this.movimiento = movimiento;
		this.saldofin = d;
	}
	public Date getFechahora() {
		return fechahora;
	}
	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getCajero() {
		return cajero;
	}
	public void setCajero(String cajero) {
		this.cajero = cajero;
	}
	public String getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}
	public String getMovimiento() {
		return movimiento;
	}
	public void setMovimiento(String movimiento) {
		this.movimiento = movimiento;
	}
	public double getSaldofin() {
		return saldofin;
	}
	public void setSaldofin(double saldofin) {
		this.saldofin = saldofin;
	}
	@Override
	public String toString() {
		return "Ticket [fechahora=" + fechahora + ", lugar=" + lugar + ", cajero=" + cajero + ", tarjeta=" + tarjeta
				+ ", movimiento=" + movimiento + ", saldofin=" + saldofin + "]";
	}
	
	

}
