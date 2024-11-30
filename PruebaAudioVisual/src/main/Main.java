package main; 

import controller.Controlador; 
import view.Vista; 

public class Main { 
	public static void main(String[] args) { 
		Vista vista = new Vista();
		Controlador controlador = new Controlador(vista); 
		
		controlador.leerDesdeArchivo("contenidos.csv"); 	
		controlador.mostrarDetalles(); 
		controlador.guardarEnArchivo("contenidos_guardados.csv"); 
	} 
}