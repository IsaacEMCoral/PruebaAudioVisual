package model;

public class Documental extends ContenidoAudiovisual {
	private String tema;

	public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
		super(titulo, duracionEnMinutos, genero);
		this.tema = tema;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del Documental:");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
		System.out.println("Género: " + getGenero());
		System.out.println("Tema: " + getTema());
	}
}