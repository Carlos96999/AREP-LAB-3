package edu.escuelaing.arep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CBaseDatos 
{
	private static String uri = "";
	private static String user = "";
	private static String password = "";
	private static Connection conexion = null;
	
	/**
	 * Constructor de la Clase.
	 */
	public CBaseDatos() {
		try {
			Class.forName("org.postgresql.Driver");
			conexion = DriverManager.getConnection(uri, user, password);
		}catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	/**
	 * Permite crear la tabla gomas.
	 */
	public void createTable() {
		
		String CREATE_TABLE="CREATE TABLE gomas ("
				+ "MARCA VARCHAR(20) NOT NULL,"
				+ "NOMBRE VARCHAR(20) NOT NULL,"
				+ "PRECIO INTEGER(20) NOT NULL,"
				+ "CADUCIDAD VARCHAR(20) NOT NULL,";
		
        try {
            Statement statement = conexion.createStatement();
            statement.execute(CREATE_TABLE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	/**
	 * Permite obtener la informacion de la tabla.
	 * @return retorna un arreglo con los datos que contiene la base de datos.
	 */
	public ArrayList<String[]> getGoma(){
		
		ArrayList<String[]> lista = new ArrayList<>();
		String select = "SELECT * FROM partidos;";
		try {
			Statement  statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery(select);
			while(resultSet.next()) {
				String MARCA = resultSet.getString("MARCA");
				String NOMBRE = resultSet.getString("NOMBRE");
				String PRECIO = resultSet.getString("PRECIO");
				String CADUCIDAD = resultSet.getString("CADUCIDAD");
				String[] valores = {MARCA, NOMBRE, PRECIO, CADUCIDAD};
				lista.add(valores);
			}
		} catch (SQLException e) {
            e.printStackTrace();
        }
		return lista;
	}
}
