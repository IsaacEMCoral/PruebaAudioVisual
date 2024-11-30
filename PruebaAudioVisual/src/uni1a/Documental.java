package uni1a;

//Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
private String tema;
private String investigador;

public Documental(String titulo, int duracionEnMinutos, String genero, String tema, String investigador) {
	super(titulo, duracionEnMinutos, genero);
    this.tema = tema;
    this.investigador = investigador;
}

public String getTema() {
    return tema;
}

public void setTema(String tema) {
    this.tema = tema;
}

public String getInvestigador() {
    return investigador;
}

public void setInvestigador(String investigador) {
    this.investigador = investigador;
}
 
@Override
public void mostrarDetalles() {
    System.out.println("Detalles del Documental:");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    System.out.println("Género: " + getGenero());
    System.out.println("Tema: " + getTema());
    System.out.println("Investigador: " + getInvestigador());
    System.out.println();
 	}
}