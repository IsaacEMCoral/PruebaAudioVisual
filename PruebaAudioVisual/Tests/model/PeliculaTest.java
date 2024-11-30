package model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PeliculaTest {
    private Pelicula pelicula;

    //Inicializacion de los elementos para el test
    @Before
    public void setUp() {
        pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
    }

    //Comparacion de los datos conocidos con los datos guardadoos en las variables
    @Test
    public void testGetEstudio() {
        assertEquals("20th Century Studios", pelicula.getEstudio());
    }

    @Test
    public void testSetEstudio() {
        pelicula.setEstudio("Universal Pictures");
        assertEquals("Universal Pictures", pelicula.getEstudio());
    }

    @Test
    public void testMostrarDetalles() {
        pelicula.mostrarDetalles();
    }
}
