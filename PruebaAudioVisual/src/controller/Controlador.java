package controller;

import model.*;
import view.Vista;
import java.io.*;
import java.util.*;

public class Controlador {
    private Vista vista;
    private List<ContenidoAudiovisual> contenidos;

    public Controlador(Vista vista) {
        this.vista = vista;
        this.contenidos = new ArrayList<>();
    }

    public void leerDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                ContenidoAudiovisual contenido = crearContenidoAudiovisual(datos);
                if (contenido != null) {
                    contenidos.add(contenido);
                }
            }
        } catch (IOException e) {
            vista.mostrarMensaje("Error al leer el archivo: " + e.getMessage());
        }
    }

    private ContenidoAudiovisual crearContenidoAudiovisual(String[] datos) {
        switch (datos[0]) {
            case "Pelicula":
                return new Pelicula(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]);
            case "SerieDeTV":
                return new SerieDeTV(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]);
            case "Documental":
                return new Documental(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]);
            case "Videojuego":
                return new Videojuego(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4], datos[5]);
            case "Podcast":
                return new Podcast(datos[1], Integer.parseInt(datos[2]), datos[3], datos[4], datos[5]);
            case "Actor":
                return new Actor(datos[1]);
            case "Temporada":
                return new Temporada(Integer.parseInt(datos[1]));
            case "Investigador":
                return new Investigador(datos[1]);
            default:
                return null;
        }
    }

    public void guardarEnArchivo(String nombreArchivo) {
        try (PrintWriter escritorLinea = new PrintWriter(new FileWriter(nombreArchivo))) {
            for (ContenidoAudiovisual contenido : contenidos) {
                if (contenido instanceof Pelicula) {
                    Pelicula pelicula = (Pelicula) contenido;
                    escritorLinea.println("Pelicula," + pelicula.getTitulo() + "," + pelicula.getDuracionEnMinutos() + "," + pelicula.getGenero() + "," + pelicula.getEstudio());
                } else if (contenido instanceof Actor) {
                    Actor actor = (Actor) contenido;
                    escritorLinea.println("Actor," + actor.getNombreActor());
                } else if (contenido instanceof SerieDeTV) {
                    SerieDeTV serie = (SerieDeTV) contenido;
                    escritorLinea.println("SerieDeTV," + serie.getTitulo() + "," + serie.getDuracionEnMinutos() + "," + serie.getGenero() + "," + serie.getEstudio());
                } else if (contenido instanceof Documental) {
                    Documental documental = (Documental) contenido;
                    escritorLinea.println("Documental," + documental.getTitulo() + "," + documental.getDuracionEnMinutos() + "," + documental.getGenero() + "," + documental.getTema());
                } else if (contenido instanceof Videojuego) {
                    Videojuego videojuego = (Videojuego) contenido;
                    escritorLinea.println("Videojuego," + videojuego.getTitulo() + "," + videojuego.getDuracionEnMinutos() + "," + videojuego.getGenero() + "," + videojuego.getTema() + "," + videojuego.getDesarrollador());
                } else if (contenido instanceof Podcast) {
                    Podcast podcast = (Podcast) contenido;
                    escritorLinea.println("Podcast," + podcast.getTitulo() + "," + podcast.getDuracionEnMinutos() + "," + podcast.getGenero() + "," + podcast.getTema() + "," + podcast.getNombreCanal());
                } else if (contenido instanceof Temporada) {
                    Temporada temporada = (Temporada) contenido;
                    escritorLinea.println("Temporada," + temporada.getNumeroDeTemporadas());
                } else if (contenido instanceof Investigador) {
                    Investigador investigador = (Investigador) contenido;
                    escritorLinea.println("Investigador," + investigador.getNombreInvestigador());
                }
            }
        } catch (IOException e) {
            vista.mostrarMensaje("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public void mostrarDetalles() {
        vista.mostrarDetalles(contenidos);
    }
}
