package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ejercicio1 {
		static Connection con=null;
		static PreparedStatement ps=null;
		static ResultSet rs=null;
		static String queryConsulta="SELECT * FROM CLIENTE";
	public static void main(String[] args) throws SQLException {
		//hacer las funciones de consulta, insersion, 
		//actualizacion y eliminacion de datos sql de la tabla clientes
		Scanner sc=new Scanner(System.in);
		//CONSULTA DE DATOS
		
		String queryInsercion="INSERT INTO CLIENTE VALUES(?,?,?,?)";
		String queryModificacion="UPDATE CLIENTE SET NOMBRE=?,CORREO=?,TELEFONO=? WHERE CLIENTE_ID=?";
		
		String nombre = "",correo = "",telefono="",ID="";
		
		System.out.println("¿Que operacion deseas realizar?");
		System.out.println(" 1.consulta \n 2.Registro \n 3.Modificacion \n 4.Eliminacion");
		String operacion=sc.nextLine();
		switch (Integer.parseInt(operacion)) {
		case 1:
			Consulta(queryConsulta);
			break;
		case 2:
			//Consulta(queryConsulta);
			for (int i = 0; i < 3; i++) {
				if (i==0) {
					System.out.println("Escribe el nombre");
					nombre=sc.nextLine();
				}
				if (i==1) {
					System.out.println("Escribe el correo");
					correo=sc.nextLine();
				}
				if (i==2) {
					System.out.println("Escribe el numero telefonico");
					telefono=sc.nextLine();
				}
			}
			Insercion(queryInsercion, nombre, correo, telefono);
			break;
		case 3:
			Consulta(queryConsulta);
			for (int i = 0; i < 4; i++) {
				if (i==0) {
					System.out.println("Escribe el identificador");
					ID=sc.nextLine();
				}
				if (i==1) {
					System.out.println("Escribe el nombre");
					nombre=sc.nextLine();
				}
				if (i==2) {
					System.out.println("Escribe el correo");
					correo=sc.nextLine();
				}
				if (i==3) {
					System.out.println("Escribe el numero telefonico");
					telefono=sc.nextLine();
				}
			}
			Modificacion(queryModificacion, Integer.parseInt(ID),nombre, correo, telefono);
			break;
		case 4:
			Consulta(queryConsulta);
			System.out.println("Escribe el identificador del cliente!");
			ID=sc.nextLine();
			String queryEliminar="DELETE FROM CLIENTE WHERE CLIENTE_ID="+ID;
			Eliminar(queryEliminar);
			break;
		default:
			System.out.println("No se detecto ninguna operacion");
			break;
		}
		
	}
	public static void Consulta(String query) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Jose","admin");
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getNString("CLIENTE_ID")+"--"+rs.getNString("NOMBRE")+"--"+
						rs.getNString("CORREO")+"--"+rs.getNString("TELEFONO")
						);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void Insercion(String query, String nombre, String correo, String telefono) throws SQLException {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Jose","admin");
			ps=con.prepareStatement(query);
			ps.setInt(1, 7);
			ps.setString(2, nombre);
			ps.setString(3, correo);
			ps.setString(4, telefono);
			
			int res=ps.executeUpdate();//guarda un valor numerico
			if (res>0) {
				System.out.println("Datos guardados exitosamente");
			}else {
				System.out.println("Error al guardar los datos");
			}
			Consulta(queryConsulta);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Modificacion(String query,int ID, String nombre, String correo, String telefono) throws SQLException {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Jose","admin");
			ps=con.prepareStatement(query);
			ps.setString(1, nombre);
			ps.setString(2, correo);
			ps.setString(3, telefono);
			ps.setInt(4, ID);
			int res=ps.executeUpdate();//guarda un valor numerico
			if (res>0) {
				System.out.println("Datos modificados exitosamente");
			}else {
				System.out.println("Error al modificar los datos");
			}
			Consulta(queryConsulta);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Eliminar(String query) {
		try {
			//crear y habrir una conexion a la base de datos
			Class.forName("oracle.jdbc.OracleDriver");
//			con.setAutoCommit(true);
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Jose","admin");
		
			ps=con.prepareStatement(query);
			int flag = ps.executeUpdate();
			if (flag>0) {
				System.out.println("Registro eliminado exitosamente!");
			}else {
				System.out.println("Error al eliminar la informacion!");
			}
			Consulta(queryConsulta);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
