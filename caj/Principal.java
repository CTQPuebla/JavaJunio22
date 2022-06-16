package caj;

import java.util.InputMismatchException;
import java.util.Scanner;

import caj.Cajero;

public class Principal {
	public static void main(String[] args) {
		Cajero cajero = new Cajero("Calle 1", "Cajero 1");
		Scanner sc = new Scanner(System.in);
		double cantidad = 0;
		do {
			try {
				System.out.println("\nBienvenido, ingrese cantidad a retirar: ");
			cantidad = sc.nextDouble();
			}catch(InputMismatchException e) {
				System.out.println("Error, introduzca un numero valido");
				cantidad = 0;
				sc.nextLine();
			}
			
		}while(cajero.retirar(cantidad)!=0);
		System.out.println("\nCerrado, cajero sin fondo ");
	}
}