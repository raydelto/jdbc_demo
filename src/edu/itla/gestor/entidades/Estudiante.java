/**
 * @author Raydelto Hernandez Perera ( www.raydelto.org ) 
 * 
 */
package edu.itla.gestor.entidades;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String matricula;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Estudiante(String nombre, String apellido, String matricula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.matricula = matricula;
	}
}
