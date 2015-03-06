/**
 * @author Raydelto Hernandez Perera ( www.raydelto.org ) 
 * 
 */
package edu.itla.gestor.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.itla.configuracion.GestorDeConfiguracion;

public class Conexion {
	private static Conexion instancia;
	private Statement enunciado;
	private Connection conexion;
	private GestorDeConfiguracion config;
		
	public static Conexion getInstancia() throws Exception{
		return instancia == null ? instancia = new Conexion() : instancia;
	}
	
	private Conexion() throws Exception{
		//Cargando manejador de MySQL
		config = GestorDeConfiguracion.getInstancia();
		Class.forName(config.getConfig("clase_driver")).newInstance();
		conexion = DriverManager.getConnection(config.getConfig("string_conexion"));
		enunciado = conexion.createStatement();
	}
	
	public ResultSet consultar(String sql) throws SQLException{
		return enunciado.executeQuery(sql);
	}
	
	public void ejecutar(String sql) throws SQLException{
		enunciado.execute(sql);
	}

}
