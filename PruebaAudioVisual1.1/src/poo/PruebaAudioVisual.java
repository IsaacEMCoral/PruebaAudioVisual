package poo;

import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
		System.out.println("Hello from Eclipse!");

		// Crear instancias de las subclases
		ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[8];
		contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
		contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", "HBO");
		contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
		contenidos[3] = new Videojuego("The Silver Case", 1104, "Visual Novel", "Horror","GRASSHOPPER MANUFACTURE INC.");
		contenidos[4] = new Podcast("Clooless", 88, "Commedy", "Chatting", "Clooless Podcast");
		contenidos[5] = new Actor("Sam Worthington");
		contenidos[6] = new Temporada(8);
		contenidos[7] = new Investigador("Neil deGrasse Tyson");

		// Mostrar los detalles de cada contenido audiovisual
		for (ContenidoAudiovisual contenido : contenidos) {
			contenido.mostrarDetalles();
		}
	}
}