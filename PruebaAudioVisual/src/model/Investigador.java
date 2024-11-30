package model;

public class Investigador extends ContenidoAudiovisual {
	private String nombreInvestigador;

	public Investigador(String nombreInvestigador) {
		super(nombreInvestigador, 0, "");

		this.nombreInvestigador = nombreInvestigador;
	}

	public String getNombreInvestigador() {
		return nombreInvestigador;
	}

	public void setNombreInvestigador(String nombreInvestigador) {
		this.nombreInvestigador = nombreInvestigador;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Nombre del investigador: " + nombreInvestigador);
		System.out.println();
	}
}
