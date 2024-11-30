package uni1a;

//Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
private int temporadas;
private String estudio;

public SerieDeTV(String titulo, int duracionEnMinutos, String genero, String estudio, int temporadas) {
    super(titulo, duracionEnMinutos, genero);
    this.temporadas = temporadas;
    this.estudio = estudio;
}

public int getTemporadas() {
    return temporadas;
}

public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
}
 
public String getEstudio() {
    return estudio;
}

public void setEstudio(String estudio) {
    this.estudio = estudio;
}
 
@Override
public void mostrarDetalles() {
    System.out.println("Detalles de la Serie de TV:");
    System.out.println("ID: " + getId());
    System.out.println("Título: " + getTitulo());
    System.out.println("Duración en minutos: " + getDuracionEnMinutos());
    System.out.println("Género: " + getGenero());
    System.out.println("Estudio: " + getEstudio());
    System.out.println("Temporadas: " + getTemporadas());
    System.out.println();
	}
}