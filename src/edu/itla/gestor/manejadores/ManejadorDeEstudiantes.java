/**
 * @author Raydelto Hernandez Perera ( www.raydelto.org ) 
 * 
 */
package edu.itla.gestor.manejadores;

import java.sql.ResultSet;
import java.util.ArrayList;

import edu.itla.gestor.datos.Conexion;
import edu.itla.gestor.entidades.Estudiante;

public class ManejadorDeEstudiantes {
	private ArrayList<Estudiante> estudiantes;
	private static ManejadorDeEstudiantes instancia;

	public static ManejadorDeEstudiantes getInstancia() throws Exception {
		return instancia == null ? instancia = new ManejadorDeEstudiantes()
				: instancia;
	}

	private ManejadorDeEstudiantes() {
		estudiantes = new ArrayList<Estudiante>();
	}

	public ArrayList<Estudiante> getEstudiantes() throws Exception{
		Conexion conexion = Conexion.getInstancia();
		ResultSet resultado = conexion
				.consultar("select nombre,apellido,matricula from estudiantes");
		while (resultado.next()) {
			estudiantes.add(new Estudiante(resultado.getString("nombre"),
					resultado.getString("apellido"), resultado
							.getString("matricula")));
		}

		return estudiantes;
	}

}
