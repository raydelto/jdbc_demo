/**
 * @author Raydelto Hernandez Perera ( www.raydelto.org ) 
 * 
 */
package edu.itla.configuracion;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GestorDeConfiguracion {
	private static GestorDeConfiguracion instancia;
	private Properties propiedades;
	
	public static GestorDeConfiguracion getInstancia() throws IOException{
		return instancia == null ? instancia = new GestorDeConfiguracion() : instancia;
	}
	
	private GestorDeConfiguracion() throws IOException{
		propiedades = new Properties();
		propiedades.load(new FileReader("config.properties"));
	}
	
	public String getConfig(String llave){
		return propiedades.getProperty(llave);
	}
}
