package com;

public class Cajero {

	private double[] denominacion = {1000,500,200,100,50,20,10,5,2,1,0.5};
	private int[] cantidad = {2,5,10,20,30,40,50,100,200,300,100};
	
	public Cajero () {
		
	}
	
	public void retirar(double monto) {
		
		int contador[] = {0,0,0,0,0,0,0,0,0,0,0};
		String valores[] = {"Mil","Quinientos","Doscientos","Cien","Cincuenta","Veinte","Diez",
				"Cinco","Dos","Uno", "Cincuenta centavos"};
		int cantidadAux;
		
		if(monto > verTotal()) {
			System.out.println("Dinero insuficiente en el cajero");
			mostrarDinero();
		} else {
			for(int i = 0; i < denominacion.length; i++) {
				cantidadAux = cantidad[i];
				for(int j = 0; j <= cantidadAux; j++) {
					if(monto >= denominacion[i] && cantidad[i] > 0) {
						contador[i]++;
						monto -= denominacion[i];
						cantidad[i]--;
					}
				}
			}
		}
		
		System.out.println("Dinero entregado");
		for(int i = 0; i <= 10; i++) {
			System.out.println(valores[i]+": "+contador[i]);
		}
			
	}
	
	public void mostrarDinero() {
		System.out.println("\nEfectivo en cajero");
		System.out.println(verTotal());
		for(int i = 0; i <= 10; i++) {
			System.out.println("Denominación: "+denominacion[i]+" Cantidad: "+cantidad[i]);
		}
	}
	
	public double verTotal() {
		int total = 0;
		for(int i = 0; i <= 10; i++) {
			total += cantidad[i]*denominacion[i];
		}
		return total;
	}
		
}
