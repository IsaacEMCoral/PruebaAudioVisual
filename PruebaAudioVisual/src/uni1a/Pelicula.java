package uni1a;

//Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
private String estudio;
private String actor;

public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, String actor) {
    super(titulo, duracionEnMinutos, genero);
    this.estudio = estudio;
    this.actor = actor;
}

public String getEstudio() {
    return estudio;
}

public void setEstudio(String estudio) {
    this.estudio = estudio;
}
 
public String getActor() {
    return actor;
}

public void setActor(String actor) {
    this.actor = actor;
}
 
@Override
public void mostrarDetalles() {
    System.out.println("Detalles de la película:");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    System.out.println("Género: " + getGenero());
    System.out.println("Estudio: " + estudio);
    System.out.println("Actor: " + actor);
    System.out.println();
	}
}