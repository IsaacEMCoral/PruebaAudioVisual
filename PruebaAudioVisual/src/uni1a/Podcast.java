package uni1a;

//Subclase Podcast que extiende de ContenidoAudiovisual
public class Podcast extends ContenidoAudiovisual {
private String tema;
private String nombreCanal;

public Podcast(String titulo, int duracionEnMinutos, String genero, String tema, String nombreCanal) {
	super(titulo, duracionEnMinutos, genero);
  this.tema = tema;
  this.nombreCanal = nombreCanal;
}

public String getTema() {
  return tema;
}

public void setTema(String tema) {
  this.tema = tema;
}

public String getNombreCanal() {
  return nombreCanal;
}

public void setNombreCanal(String nombreCanal) {
  this.nombreCanal = nombreCanal;
}

@Override
public void mostrarDetalles() {
	System.out.println("Detalles del Podcast:");
	System.out.println("ID: " + getId());
	System.out.println("Título: " + getTitulo());
  	System.out.println("Duración en minutos: " + getDuracionEnMinutos());
  	System.out.println("Género: " + getGenero());
  	System.out.println("Tema: " + getTema());
  	System.out.println("Nombre del Canal: " + getNombreCanal());
  	System.out.println();
	}
}