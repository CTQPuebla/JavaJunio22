package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Cajero cajero = new Cajero();
		Scanner sc = new Scanner(System.in);
		double monto;
		
		cajero.mostrarDinero();
		do {
				
			System.out.println("\nIngrese la cantidad a retirar");
			monto = sc.nextDouble();
			
			cajero.retirar(monto);
			
			cajero.mostrarDinero();
			
		} while(cajero.verTotal() > 0);
		
		System.out.println("\nEl cajero se encuentra sin fondos");
	}
}
