package uni1a;

public abstract class ContenidoAudiovisual {
	private static int contar = 0;
	private String titulo;
	private int duracionEnMinutos;
	private String genero;
	private int id;
	private int numeroDeTemporadas;
	private String nombreActor;
	private String nombreInvestigador;

	public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero) {
		this.id = contar++;
		this.titulo = titulo;
		this.duracionEnMinutos = duracionEnMinutos;
		this.genero = genero;
	}

	// Getter y Setter para el campo 'titulo'
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	// Getter y Setter para el campo 'duracionEnMinutos'
	public int getDuracionEnMinutos() {
		return duracionEnMinutos;
	}

	public void setDuracionEnMinutos(int duracionEnMinutos) {
		this.duracionEnMinutos = duracionEnMinutos;
	}

	// Getter y Setter para el campo 'genero'
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	// Getter para el campo 'id' (no se proporciona el Setter ya que 'id' se asigna
	// en el constructor y parece ser inmutable)
	public int getId() {
		return id;
	}

	public ContenidoAudiovisual(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	public int getTemporadas() {
		return numeroDeTemporadas;
	}

	public void setTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	public ContenidoAudiovisual(String nombreActor) {
		this.nombreActor = nombreActor;
	}

	public String getNombre() {
		return nombreActor;
	}

	public void setNombre(String nombreActor) {
		this.nombreActor = nombreActor;
	}

	public ContenidoAudiovisual(String nombreInvestigador) {
		this.nombreInvestigador = nombreInvestigador;
	}

	public String getNombreInvestigador() {
		return nombreInvestigador;
	}

	public void setNombreInvestigador(String nombreInvestigador) {
		this.nombreInvestigador = nombreInvestigador;
	}

	public abstract void mostrarDetalles();
}