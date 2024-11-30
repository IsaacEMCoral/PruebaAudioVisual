package model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class VideojuegoTest {
    private Videojuego videojuego;

    //Inicializacion de los elementos para el test
    @Before
    public void setUp() {
        videojuego = new Videojuego("The Silver Case", 1104, "Visual Novel", "Horror", "GRASSHOPPER MANUFACTURE INC.");
    }

    //Comparacion de los datos conocidos con los datos guardadoos en las variables
    @Test
    public void testGetDesarrollador() {
        assertEquals("GRASSHOPPER MANUFACTURE INC.", videojuego.getDesarrollador());
    }

    @Test
    public void testSetDesarrollador() {
        videojuego.setDesarrollador("From Soft");
        assertEquals("From Soft", videojuego.getDesarrollador());
    }

    @Test
    public void testMostrarDetalles() {
        videojuego.mostrarDetalles();
    }
}
