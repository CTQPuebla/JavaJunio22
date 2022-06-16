package caj;

public class Cajero {
	//retirar, consultar, depositar, transferencia
		public String ubicacion;
		private String identificador;
		private int folio;
		private double dineroTotal = 12550;
		private double[][] dineroDisponible = new double[11][2];
		private double[][] dineroDado = new double[11][2];
		
		public Cajero(String ubicacion, String identificador) {
			this.ubicacion = ubicacion;
			this.identificador = identificador;
			dineroDisponible[0][0] = 2; 
			dineroDisponible[1][0] = 5; 
			dineroDisponible[2][0] = 10; 
			dineroDisponible[3][0] = 20; 
			dineroDisponible[4][0] = 30; 
			dineroDisponible[5][0] = 40; 
			dineroDisponible[6][0] = 50; 
			dineroDisponible[7][0] = 100; 
			dineroDisponible[8][0] = 200; 
			dineroDisponible[9][0] = 300; 
			dineroDisponible[10][0] = 400;
			dineroDisponible[0][1] = 1000.0; 
			dineroDisponible[1][1] = 500.00; 
			dineroDisponible[2][1] = 200.00; 
			dineroDisponible[3][1] = 100.00; 
			dineroDisponible[4][1] = 50.00; 
			dineroDisponible[5][1] = 20.00; 
			dineroDisponible[6][1] = 10.00; 
			dineroDisponible[7][1] = 5.00; 
			dineroDisponible[8][1] = 2.00; 
			dineroDisponible[9][1] = 1.00; 
			dineroDisponible[10][1] = 0.50;
		}

		public String getUbicacion() {
			return ubicacion;
		}

		public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
		}

		public String getIdentificador() {
			return identificador;
		}

		public void setIdentificador(String identificador) {
			this.identificador = identificador;
		}

		@Override
		public String toString() {
			return "Cajero [ubicacion=" + ubicacion + ", identificador=" + identificador + ", folio=" + folio + "]";
		}

		public double retirar(double monto) {
			double acumulador = 0;
			if(dineroTotal<monto) {
				System.out.println("Fondos insuficientes, el total del cajero es: "+dineroTotal);
			}else {
				for (int i = 0; i < this.dineroDisponible.length; i++) {
					if(dineroDisponible[i][0] != 0.0) {
						for (int j = 0; j < dineroDisponible[i][0]; j++) {
							if(acumulador+dineroDisponible[i][1]<=monto) {
								acumulador += dineroDisponible[i][1];
								dineroDado[i][0] = j+1;
								dineroDado[i][1] = dineroDisponible[i][1];
							}else {
								break;
							}
						}
					}
				}
			}
			if(acumulador == monto) {
				System.out.println("\nSe entrego la cantidad de: "+monto+" de la siguiente manera: ");
				for (int i = 0; i < dineroDado.length; i++) {
					if(dineroDado[i][0] != 0.0) {
						dineroDisponible[i][0] = dineroDisponible[i][0]-dineroDado[i][0];
						System.out.println("Se entregaron "+dineroDado[i][0]+" de $"+dineroDado[i][1]);
						dineroDado[i][0] = 0;
					}
				}
				dineroTotal-=acumulador;
				System.out.println("Saldo actual del cajero: "+dineroTotal);
			}else {
				System.out.println("No cuento con el cambio suficiente, lo mas cercano que puedo dar es: "+acumulador);
			}
			return dineroTotal;
			//System.out.println("Dinero nuevo: "+dineroTotal+"acumulador"+acumulador);
		}
}
