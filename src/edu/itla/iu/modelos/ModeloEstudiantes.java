/**
 * @author Raydelto Hernandez Perera ( www.raydelto.org ) 
 * 
 */
package edu.itla.iu.modelos;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import edu.itla.gestor.entidades.Estudiante;
import edu.itla.gestor.manejadores.ManejadorDeEstudiantes;

public class ModeloEstudiantes extends AbstractTableModel{
	private static final long serialVersionUID = 1L;
	private String encabezados[] = {"Nombre","Apellido","Matricula"};
	private ArrayList<Estudiante> estudiantes;
	private static ModeloEstudiantes instancia;

	
	
	public static ModeloEstudiantes getInstancia(){
		return instancia == null ? instancia = new ModeloEstudiantes() : instancia;
	}

	private  ModeloEstudiantes() {
		try {
			estudiantes = ManejadorDeEstudiantes.getInstancia().getEstudiantes();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error al obtener estudiantes", "Error de conexión", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

	}

	@Override
	public String getColumnName(int column) {
		return encabezados[column];
	}
			
	@Override
	public int getRowCount() {
		return estudiantes.size();
	}

	@Override
	public int getColumnCount() {
		return encabezados.length;
	}

	@Override
	public Object getValueAt(int fila, int columna) {
		Estudiante estudiante = estudiantes.get(fila);
		switch(columna){
		case 0:
			return estudiante.getNombre();
		case 1:
			return estudiante.getApellido();
		case 2:
			return estudiante.getMatricula();
		default:
			return null;					
		}		
	}

}
