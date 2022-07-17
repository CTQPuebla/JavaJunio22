package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal {

	public static void main(String[] args) {
		
		Connection con=null;
		PreparedStatement ps=null;//la clase preparedstatement proporciona un metodo para precolipar las sentencias
		ResultSet rs=null;//la clase resultset es el mecanismo por el cual las sentencias clasificadas en la base de datos tienen salida
		
		
		//ELIMINAR UN REGISTRO
		String query="DELETE FROM EMPLEADOS WHERE EMPLEADO_ID = "+26;//?marcadores de posicion, indican las columnas de la tabla
		try {
			//crear y habrir una conexion a la base de datos
			Class.forName("oracle.jdbc.OracleDriver");
			con.setAutoCommit(true);
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Jose","admin");
			ps=con.prepareStatement(query);
			int flag = ps.executeUpdate();
			if (flag>0) {
				System.out.println("Registro eliminado exitosamente!");
			}else {
				System.out.println("Error al eliminar la informacion!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Actualizar un registro
//		String query="UPDATE EMPLEADOS SET NOMBRE = ?, AP_PATERNO = ?,"
//				+"AP_MATERNO = ?, FECHA_NACIMIENTO = ?, SEXO = ?,"
//				+"FECHA_ALTA = ?, DEPARTAMENTO_ID = ?, STATUS = ?"
//				+"WHERE EMPLEADO_ID = ?";//?marcadores de posicion, indican las columnas de la tabla
//		try {
//			//crear y habrir una conexion a la base de datos
//			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Jose","admin");
//			ps=con.prepareStatement(query);
//			ps.setString(1, "CAMILA");
//			ps.setString(2, "CABELLO");
//			ps.setString(3, "PEREZ");
//			ps.setDate(4, new Date(3922,5,24));//date sql es una clase que hereda de java.util, es un objeto obsoleto
//			ps.setString(5, "FEMENINO");
//			ps.setDate(6, new Date(3922,5,24));
//			ps.setInt(7, 3);
//			ps.setInt(8, 1);
//			ps.setInt(9, 26);
//			
//			int flag = ps.executeUpdate();
//			if (flag>0) {
//				System.out.println("Guardado exitosamente!");
//			}else {
//				System.out.println("Error al guardar la informacion!");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		//insertar un registro
//		String query="INSERT INTO EMPLEADOS VALUES(?,?,?,?,?,?,?,?,?)";//?marcadores de posicion, indican las columnas de la tabla
//		try {
//			//crear y habrir una conexion a la base de datos
//			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Jose","admin");
//			ps=con.prepareStatement(query);
//			ps.setInt(1, 15);
//			ps.setString(2, "Gabriel");
//			ps.setString(3, "Montes");
//			ps.setString(4, "Garcia");
//			ps.setDate(5, new Date(3922,5,24));//date sql es una clase que hereda de java.util, es un objeto obsoleto
//			ps.setString(6, "MASCULINO");
//			ps.setDate(7, new Date(3922,5,24));
//			ps.setInt(8, 2);
//			ps.setInt(9, 1);
//			
//			int flag = ps.executeUpdate();
//			if (flag>0) {
//				System.out.println("Guardado exitosamente!");
//			}else {
//				System.out.println("Error al guardar la informacion!");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
//		//sentencia SQL
//		String query = "SELECT * FROM EMPLEADOS";
//		//No siempre se va a poder realizar
//		try {
//			//crear y habrir una conexion a la base de datos
//			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Jose","admin");
//			ps=con.prepareStatement(query);
//			rs = ps.executeQuery();
//			while (rs.next()) {
//				System.out.println(rs.getNString("EMPLEADO_ID")+":"+rs.getString("NOMBRE"));
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
	}
	

}
