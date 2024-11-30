package poo;

import uni1a.*;
import java.io.*;
import java.util.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
		System.out.println("Detalles de los contenidos audio visuales:");
		System.out.println();

		// Leer datos desde un archivo CSV previamente escrito
		List<ContenidoAudiovisual> contenidos = leerDesdeArchivo("contenidos.csv");

		// Mostrar los detalles de cada contenido audiovisual
		for (ContenidoAudiovisual contenido : contenidos) {
			contenido.mostrarDetalles();
		}

		// Guardar los datos en un archivo CSV
		guardarEnArchivo(contenidos, "contenidos_guardados.csv");
	}

	// Metodo para leer los datos desde el archivo CSV "contenidos"
	public static List<ContenidoAudiovisual> leerDesdeArchivo(String nombreArchivo) {
		List<ContenidoAudiovisual> contenidos = new ArrayList<>();
		try (BufferedReader lectorLineas = new BufferedReader(new FileReader(nombreArchivo))) {
			String linea;
			while ((linea = lectorLineas.readLine()) != null) {

				// Condicion para poder separar los datos del archivo CSV "contenidos"
				String[] datos = linea.split(",");
				switch (datos[0]) {
				case "Pelicula":
					contenidos.add(new Pelicula(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
					break;
				case "Actor":
					contenidos.add(new Actor(datos[1]));
					break;
				case "SerieDeTV":
					contenidos.add(new SerieDeTV(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
					break;
				case "Temporada":
					contenidos.add(new Temporada(Integer.parseInt(datos[1])));
					break;
				case "Documental":
					contenidos.add(new Documental(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
					break;
				case "Investigador":
					contenidos.add(new Investigador(datos[1]));
					break;
				case "Videojuego":
					contenidos.add(new Videojuego(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4], datos[5]));
					break;
				case "Podcast":
					contenidos.add(new Podcast(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4], datos[5]));
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return contenidos;
	}

	// Metodo para guardar los resultados en el archivo "contenidos_guardados"
	// e imprimir en consola los datos de cada tipo de contenido audio visual
	public static void guardarEnArchivo(List<ContenidoAudiovisual> contenidos, String nombreArchivo) {
		try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo))) {
			// Guardar los contenidos en el archivo
			contenidos.forEach(contenido -> {
				if (contenido instanceof Pelicula) {
					Pelicula pelicula = (Pelicula) contenido;
					pw.println("Pelicula," + pelicula.getTitulo() + "," + pelicula.getDuracionEnMinutos() + ","
							+ pelicula.getGenero() + "," + pelicula.getEstudio());
				} else if (contenido instanceof Actor) {
					Actor actor = (Actor) contenido;
					pw.println("Actor," + actor.getNombreActor());
				} else if (contenido instanceof SerieDeTV) {
					SerieDeTV serie = (SerieDeTV) contenido;
					pw.println("SerieDeTV," + serie.getTitulo() + "," + serie.getDuracionEnMinutos() + ","
							+ serie.getGenero() + "," + serie.getEstudio());
				} else if (contenido instanceof Documental) {
					Documental documental = (Documental) contenido;
					pw.println("Documental," + documental.getTitulo() + "," + documental.getDuracionEnMinutos() + ","
							+ documental.getGenero() + "," + documental.getTema());
				} else if (contenido instanceof Videojuego) {
					Videojuego videojuego = (Videojuego) contenido;
					pw.println("Videojuego," + videojuego.getTitulo() + "," + videojuego.getDuracionEnMinutos() + ","
							+ videojuego.getGenero() + "," + videojuego.getTema() + ","
							+ videojuego.getDesarrollador());
				} else if (contenido instanceof Podcast) {
					Podcast podcast = (Podcast) contenido;
					pw.println("Podcast," + podcast.getTitulo() + "," + podcast.getDuracionEnMinutos() + ","
							+ podcast.getGenero() + "," + podcast.getTema() + "," + podcast.getNombreCanal());
				} else if (contenido instanceof Temporada) {
					Temporada temporada = (Temporada) contenido;
					pw.println("Temporada," + temporada.getNumeroDeTemporadas());
				} else if (contenido instanceof Investigador) {
					Investigador investigador = (Investigador) contenido;
					pw.println("Investigador," + investigador.getNombreInvestigador());
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}