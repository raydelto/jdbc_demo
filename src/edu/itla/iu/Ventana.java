/**
 * @author Raydelto Hernandez Perera ( www.raydelto.org ) 
 * 
 */
package edu.itla.iu;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import edu.itla.iu.modelos.ModeloEstudiantes;

public class Ventana extends JFrame{
	private static final long serialVersionUID = 1L;
	private JTable tblEstudiantes;
	public Ventana(){
		super("Gestor de Estudiantes v0.1");
		tblEstudiantes = new JTable(ModeloEstudiantes.getInstancia());
		JScrollPane jspEstudiantes = new JScrollPane(tblEstudiantes);
		add(jspEstudiantes);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
