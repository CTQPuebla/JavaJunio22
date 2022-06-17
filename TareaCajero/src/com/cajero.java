package com;

import java.util.Date;
import java.util.Scanner;

public class cajero {
	String lugar;
	String cajero;
	double saldo;
//	moneda
	int m10,m5,m2,m1,m50;
//	billete
	int b1000,b500,b200,b100,b50,b20;
	public cajero(String lugar, String cajero, double saldo, int m10, int m5, int m2, int m1, int m50, int b1000, int b500,
			int b200, int b100, int b50, int b20) {
		super();
		this.lugar = lugar;
		this.cajero = cajero;
		this.saldo = saldo;
		this.m10 = m10;
		this.m5 = m5;
		this.m2 = m2;
		this.m1 = m1;
		this.m50 = m50;
		this.b1000 = b1000;
		this.b500 = b500;
		this.b200 = b200;
		this.b100 = b100;
		this.b50 = b50;
		this.b20 = b20;
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
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getM10() {
		return m10;
	}
	public void setM10(int m10) {
		this.m10 = m10;
	}
	public int getM5() {
		return m5;
	}
	public void setM5(int m5) {
		this.m5 = m5;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM50() {
		return m50;
	}
	public void setM50(int m50) {
		this.m50 = m50;
	}
	public int getB1000() {
		return b1000;
	}
	public void setB1000(int b1000) {
		this.b1000 = b1000;
	}
	public int getB500() {
		return b500;
	}
	public void setB500(int b500) {
		this.b500 = b500;
	}
	public int getB200() {
		return b200;
	}
	public void setB200(int b200) {
		this.b200 = b200;
	}
	public int getB100() {
		return b100;
	}
	public void setB100(int b100) {
		this.b100 = b100;
	}
	public int getB50() {
		return b50;
	}
	public void setB50(int b50) {
		this.b50 = b50;
	}
	public int getB20() {
		return b20;
	}
	public void setB20(int b20) {
		this.b20 = b20;
	}
	@Override
	public String toString() {
		return "cajero [lugar=" + lugar + ", cajero=" + cajero + ", saldo=" + saldo + ", m10=" + m10 + ", m5=" + m5
				+ ", m2=" + m2 + ", m1=" + m1 + ", m50=" + m50 + ", b1000=" + b1000 + ", b500=" + b500 + ", b200="
				+ b200 + ", b100=" + b100 + ", b50=" + b50 + ", b20=" + b20 + "]";
	}	
	
	
}
