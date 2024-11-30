package uni1a;

//Subclase Videojuego que extiende de ContenidoAudiovisual
public class Videojuego extends ContenidoAudiovisual {
private String tema;
private String developer;

public Videojuego(String titulo, int duracionEnMinutos, String genero, String tema, String developer) {
	super(titulo, duracionEnMinutos, genero);
    this.tema = tema;
    this.developer = developer;
}

public String getTema() {
    return tema;
}

public void setTema(String tema) {
    this.tema = tema;
}

public String getDeveloper() {
    return developer;
}

public void setDeveloper(String developer) {
    this.developer = developer;
}
 
@Override
public void mostrarDetalles() {
    System.out.println("Detalles del Videojuego:");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    System.out.println("Género: " + getGenero());
    System.out.println("Tema: " + getTema());
    System.out.println("Desarrollador del Videojuego: " + getDeveloper());
    System.out.println();
 	}
}