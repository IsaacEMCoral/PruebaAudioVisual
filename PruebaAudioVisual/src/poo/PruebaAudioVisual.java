package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios", "Sam Worthington");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", "HBO", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy", "Neil deGrasse Tyson");
        contenidos[3] = new Videojuego("The Silver Case", 1104, "Visual Novel", "Horror", "GRASSHOPPER MANUFACTURE INC.");
        contenidos[4] = new Podcast("Clooless", 88, "Commedy", "Chatting", "Clooless Podcast");

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}