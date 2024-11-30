package model;

public class SerieDeTV extends ContenidoAudiovisual {

	private String estudio;

	public SerieDeTV(String titulo, int duracionEnMinutos, String genero, String estudio) {
		super(titulo, duracionEnMinutos, genero);

		this.estudio = estudio;
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
	}
}