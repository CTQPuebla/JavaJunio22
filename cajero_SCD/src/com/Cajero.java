package com;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Cajero {
	private String idCajero;
	private Date fechaHora;
	private String Ubicacion;
	private int folio;
	private List<Moneda> lista;
	private Moneda [] monedas;
	
	
	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}
	public Cajero(String idCajero, Date fechaHora, String ubicacion,int folio) {
		super();
		this.idCajero = idCajero;
		this.fechaHora = fechaHora;
		Ubicacion = ubicacion;
		this.folio=folio;
		lista = new ArrayList<Moneda>();
		iniciarDespachador();
	}
	public String getIdCajero() {
		return idCajero;
	}
	public void setIdCajero(String idCajero) {
		this.idCajero = idCajero;
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getUbicacion() {
		return Ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
	
	public void iniciarDespachador()
	{
		String tipo = "Billete";
		int c[] = {2,5,10,20,30,40,50,100,200,300,100};
		double d[]= {1000,500,200,100,50,20,10,5,2,1,.50 };
		for(int  i=0;i<d.length;i++)
		{
			if(i>5)
				tipo ="Moneda";
			
			Moneda m = new Moneda(tipo,d[i],c[i]);
			lista.add(m);
		}
	}
	
	public void retirar( double monto)
	{
		int contRes=0;
		List<Moneda> mon = new ArrayList<Moneda>();	
		double deno=0;
		String tipo="";
 	
		  for (int i = 0; i < lista.size(); i++) {
		      while(monto>=lista.get(i).getDenominacion() && lista.get(i).getCantidad()>0 &&monto>0 )
		      {
		    	  
		    	  monto = monto -lista.get(i).getDenominacion();
		    	  
		    	  lista.get(i).setCantidad(lista.get(i).getCantidad()-1);		    	  
		    	  deno=lista.get(i).getDenominacion();
		    	  tipo=lista.get(i).getTipo();
		    	  contRes++;
		    	  
		    	  //System.out.print(this.totalCajero());
		    	 
		      }
		      if(contRes != 0)
		      System.out.println("cantidad="+(int)contRes+"- Valor= $"+deno+" Tipo="+tipo);
		      contRes=0;//reseteo el con de elementos a restar 
		    }
		  
		  

	}
	
	public double totalCajero()
	{
		double acum=0;
		  for (Moneda item : this.lista) {
		      acum = acum +((double)item.getCantidad()*item.getDenominacion());
		    }
		  return acum;
		
	}
	
	public static void main(String []args)
	{
		Scanner texts = new Scanner(System.in);
		Cajero cajeritoDelOxxo =new Cajero( "24", new Date(), "a la vuelta",0);
		System.out.println(cajeritoDelOxxo.totalCajero());
		double opc=0;
		

		System.out.println(cajeritoDelOxxo.totalCajero()+">0");
			do
			{
				System.out.println("Ingrese el monto a retirar");
				opc = texts.nextDouble();
				if(cajeritoDelOxxo.totalCajero()>=opc)
				{
				
				cajeritoDelOxxo.retirar(opc);
				System.out.println(cajeritoDelOxxo.totalCajero());
				}
				else 
				{
					System.out.println("no hay suficiente efectivo para dicha cantidad");
				}
				
			}while(cajeritoDelOxxo.totalCajero()>0);
		
			
	}

}
