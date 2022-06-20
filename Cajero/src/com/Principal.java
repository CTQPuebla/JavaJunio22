package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int SaldoInicial=12550,num=0,cant;
		double retiro = 0;
		
		String[] denominacion = new String[11];
		int []CantiDisponible=new int[11];
		double []Efetivo=new double[11];
		denominacion[0]="Billete";
		denominacion[1]="Billete";
		denominacion[2]="Billete";
		denominacion[3]="Billete";
		denominacion[4]="Billete";
		denominacion[5]="Billete";
		denominacion[6]="Moneda";
		denominacion[7]="Moneda";
		denominacion[8]="Moneda";
		denominacion[9]="Moneda";
		denominacion[10]="Moneda";
		
		CantiDisponible[0]=2;
		CantiDisponible[1]=5;
		CantiDisponible[2]=10;
		CantiDisponible[3]=20;
		CantiDisponible[4]=30;
		CantiDisponible[5]=40;
		CantiDisponible[6]=50;
		CantiDisponible[7]=100;
		CantiDisponible[8]=200;
		CantiDisponible[9]=300;
		CantiDisponible[10]=100;
		
		Efetivo[0]=1000;
		Efetivo[1]=500;
		Efetivo[2]=200;
		Efetivo[3]=100;
		Efetivo[4]=50;
		Efetivo[5]=20;
		Efetivo[6]=10;
		Efetivo[7]=5;
		Efetivo[8]=2;
		Efetivo[9]=1;
		Efetivo[10]=0.50;
		
		//Denominacion(denominacion);
		System.out.println("Denominacion dispoible");
		for (int i = 0; i < Efetivo.length; i++) {
			System.out.println("		"+denominacion[i]+": "+CantiDisponible[i] +" de "+Efetivo[i]);
		}
		System.out.println("Ingresa una cantidad a retirar.");
		
		double retirar=sc.nextDouble();
		
		if (retirar<SaldoInicial) {
			System.out.println("\n Efectivo entregado en la siguiente denominacion.");
			for (int i = 0; i < Efetivo.length; i++) {
				num=(int)(retirar/Efetivo[i]);
				if (num>0 && num<=CantiDisponible[i]) {
					retiro=num*Efetivo[i];
					retirar=retirar-retiro;
					CantiDisponible[i]=CantiDisponible[i]-num;
					System.out.println("		"+num+" "+denominacion[i]+" de "+Efetivo[i]);
				}else if (num>CantiDisponible[i]) {
					cant=CantiDisponible[i];
					retiro=CantiDisponible[i]*Efetivo[i];
					retirar=retirar-retiro;
					CantiDisponible[i]=CantiDisponible[i]-CantiDisponible[i];
					System.out.println("		"+cant+" "+denominacion[i]+" de "+Efetivo[i]);
				}
			}
		}else {
			System.out.println("La cantidad sobrepasa el limite del cajero");
		}
		
		System.out.println("\nDenominacion disponible.");
		for (int i = 0; i < Efetivo.length; i++) {
			System.out.println("		"+denominacion[i]+": "+CantiDisponible[i] +" de "+Efetivo[i]);
		}
		
	}

}
