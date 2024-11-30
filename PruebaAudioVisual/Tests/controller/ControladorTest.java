package controller;

import org.junit.Before; 
import org.junit.Test; 
import view.Vista;

public class ControladorTest { 
	private Controlador controlador; 
	private Vista vista;
	
	//Inicializacion de los elementos para el test
	@Before 
	public void setUp() { 
		vista = new Vista(); 
		controlador = new Controlador(vista);
	}
	
	@Test 
	public void testGuardarEnArchivo() { 
		//Comprobacion que el guardado y lectura de los archivos sea correcta
		controlador.leerDesdeArchivo("contenidos.csv"); 
		controlador.guardarEnArchivo("contenidos_guardados.csv");  
	}
	
	@Test 
	public void testMostrarDetalles() { 
		//Comprobacion del funcionamiento del metodo MostrarDetalles
		controlador.leerDesdeArchivo("contenidos.csv"); 
		controlador.mostrarDetalles(); 
	}
}