package com;

public class Cuenta {
String ncuenta;
String titular;
String banco;
double saldo;
	public Cuenta(String ncuenta, String titular, String banco, double saldo) {
		super();
		this.ncuenta = ncuenta;
		this.titular = titular;
		this.banco = banco;
		this.saldo = saldo;
	}
	public String getNcuenta() {
		return ncuenta;
	}
	public void setNcuenta(String ncuenta) {
		this.ncuenta = ncuenta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cuenta [ncuenta=" + ncuenta + ", titular=" + titular + ", banco=" + banco + ", saldo=" + saldo + "]";
	}
	

}
