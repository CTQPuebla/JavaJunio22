package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String r="si";
		
		Cuenta c1= new Cuenta("123", "alan","banorte", 20000.00);
		
		cajero caja1= new cajero("puebla", "cajero345", 12550, 50, 100, 200, 300, 100, 2, 5, 10, 20, 30, 40);
		
		Scanner sc= new Scanner(System.in);
		double monto;
		String cuent;
		System.out.println("bienbenido a su cajero banorte");
		System.out.println("por favor ingrese su numero de cuenta");
			cuent=sc.nextLine();
		
		do {
			
		if(cuent.equals(c1.getNcuenta())) {
			System.out.println("su saldo es de: "+c1.getSaldo());
			System.out.println("cual es el monto que desea retirar");
			monto=sc.nextDouble();
			sc.nextLine();
			
			if(c1.getSaldo()<monto||c1.getSaldo()-monto<0) {
				System.out.println("fondos insuficientes");
			}
				
			else if(caja1.getSaldo()<monto||caja1.getSaldo()-monto<0) {
				System.out.println("fondos  insuficientes en el cajero");
				
				
			}
			else {
				System.out.println(caja1);
				c1.setSaldo(c1.getSaldo()-monto);
				caja1.setSaldo(caja1.getSaldo()-monto);
				System.out.println("le entregamos un total de "+monto+" en las siguientes denominaciones");
				//				________________________________________________				
				int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0;
				while(monto>0) {
					
					if(caja1.b1000>0&& monto>=1000) {
						
						try{
							monto=monto-1000;
							caja1.b1000=caja1.b1000-1;
							a=a+1;
						}
						catch(Exception ex){
						}
					}	
//____________________________________________________
					
					else if(caja1.b500>0&& monto>=500) {
						try{
						monto=monto-500;
						caja1.b500=caja1.b500-1;
						 b=b+1;
						
						}
						catch(Exception ex){
						}	
					}
//_____________________________________________________
					else if(caja1.b200>0&& monto>=200) {
						
						try{
						monto=monto-200;
						caja1.b200=caja1.b200-1;
						c=c+1;
						}
						catch(Exception ex){
						}	
					}
//_______________________________________________________
					else if(caja1.b100>0&& monto>=100) {
						 
						try{
						monto=monto-100;
						caja1.b100=caja1.b100-1;
						d=d+1;
						}
						catch(Exception ex){
						}	
					}
//_____________________________________________________
					else if(caja1.b50>0&& monto>=50) {
						
						try{
						monto=monto-50;
						caja1.b50=caja1.b50-1;
						e=e+1;
						}
						catch(Exception ex){
						}	
					}
//_____________________________________________________
					else if(caja1.b20>0&& monto>=20) {
						
						try{
						monto=monto-20;
						caja1.b20=caja1.b20-1;
						f=f+1;
						}
						catch(Exception ex){
						}	
					}
//________________________________________________________________
					else if(caja1. m10>0&& monto>=10) {
						 
						try{
						monto=monto-10;
						caja1.m10=caja1.m10-1;
						g=g+1;
						}
						catch(Exception ex){
						}
					}
//_________________________________________________
					else if(caja1.m5>0&& monto>=5) {
						
						try{
						monto=monto-5;
						caja1.m5=caja1.m5-1;
						h=h+1;
						}
						catch(Exception ex){
						}	
					}
//________________________________________________
					else if(caja1.m2>0&& monto>=2) {
						 
						try{
						monto=monto-2;
						caja1.m2=caja1.m2-1;
						i=i+1;
						}
						catch(Exception ex){
						}
//____________________________________________	
					}
					else if(caja1.m1>0&& monto>=1) {
						
						try{
						monto=monto-1;
						caja1.m1=caja1.m1-1;
						j=j+1;
						}
						catch(Exception ex){
						}	
					}
//______________________________________________________
					else {
						
						try{
						monto=monto-.5;
						caja1.m50=caja1.m50-1;
						k=k+1;
						}
						catch(Exception ex){
						}
					}
				
				}
				
			System.out.println("billetes de 1000: "+a);
			System.out.println("billetes de 500: "+b);
			System.out.println("billetes de 200: "+c);
			System.out.println("billetes de 100: "+d);
			System.out.println("billetes de 50: "+e);
			System.out.println("billetes de 20: "+f);
			System.out.println("monedas de 10: "+g);
			System.out.println("monedas de 5: "+h);
			System.out.println("monedas de 2: "+i);
			System.out.println("monedas de 1: "+j);
			System.out.println("monedas de .5: "+k);
			System.out.println("el saldo actual es: "+c1.getSaldo());
			
			}
			
		}	
		else {
			System.out.println("cuenta no valida");
			System.out.println("por favor ingrese otro numero de cuenta");
			cuent=sc.nextLine();
		}
		System.out.println(caja1);
		System.out.println("saldo del cajero: "+caja1.getSaldo());
		
		System.out.println("desea hacer otra operacion?");
		r=sc.nextLine();
		
		
		}
		while(r.equals("si")&& caja1.getSaldo()>=0);
		System.out.println("gracias por su preferencia vuelva pronto");
	}

}
