package model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TemporadaTest {
    private Temporada temporada;

    //Inicializacion de los elementos para el test
    @Before
    public void setUp() {
        temporada = new Temporada(8);
    }

    //Comparacion de los datos conocidos con los datos guardadoos en las variables
    @Test
    public void testGetNumeroDeTemporadas() {
        assertEquals(8, temporada.getNumeroDeTemporadas());
    }

    @Test
    public void testSetNumeroDeTemporadas() {
        temporada.setNumeroDeTemporadas(10);
        assertEquals(10, temporada.getNumeroDeTemporadas());
    }

    @Test
    public void testMostrarDetalles() {
        temporada.mostrarDetalles();
    }
}
