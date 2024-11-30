package uni1a;

public class Videojuego extends ContenidoAudiovisual {
private String tema;
private String desarrollador;

public Videojuego(String titulo, int duracionEnMinutos, String genero, String tema, String desarrollador) {
	super(titulo, duracionEnMinutos, genero);
    this.tema = tema;
    this.desarrollador = desarrollador;
}

public String getTema() {
    return tema;
}

public void setTema(String tema) {
    this.tema = tema;
}

public String getDesarrollador() {
    return desarrollador;
}

public void setdesarrollador(String desarrollador) {
    this.desarrollador = desarrollador;
}
 
@Override
public void mostrarDetalles() {
    System.out.println("Detalles del Videojuego:");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    System.out.println("Género: " + getGenero());
    System.out.println("Tema: " + getTema());
    System.out.println("Desarrollador del Videojuego: " + getDesarrollador());
    System.out.println();
 	}
}