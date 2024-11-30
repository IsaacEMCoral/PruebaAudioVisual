package model;

public class Temporada extends ContenidoAudiovisual {
	private int numeroDeTemporadas;

	public Temporada(int numeroDeTemporadas) {
		super("", 0, "");

		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}

	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Número de Temporadas: " + numeroDeTemporadas);
		System.out.println();
	}

}
