package view; 

import model.ContenidoAudiovisual; 
import java.util.List; 

public class Vista { 
	public void mostrarDetalles(List<ContenidoAudiovisual> contenidos) { 
		for (ContenidoAudiovisual contenido : contenidos) { 
			contenido.mostrarDetalles(); 
		} 
	} 
	
	public void mostrarMensaje(String mensaje) { 
		System.out.println(mensaje); 
	} 
}