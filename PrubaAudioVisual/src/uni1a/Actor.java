package uni1a;

public class Actor extends ContenidoAudiovisual {
	private String nombreActor;

	public Actor(String nombreActor) {
		super(nombreActor, 0, "");

		this.nombreActor = nombreActor;
	}

	public String getNombreActor() {
		return nombreActor;
	}

	public void setNombreActor(String nombreActor) {
		this.nombreActor = nombreActor;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Nombre del actor: " + nombreActor);
		System.out.println();
	}
}
