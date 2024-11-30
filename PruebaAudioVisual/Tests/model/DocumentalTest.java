package model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class DocumentalTest {
    private Documental documental;

    //Inicializacion de los elementos para el test
    @Before
    public void setUp() {
        documental = new Documental("Cosmos", 45, "Science", "Astronomy");
    }

    //Comparacion de los datos conocidos con los datos guardadoos en las variables
    @Test
    public void testGetTema() {
        assertEquals("Astronomy", documental.getTema());
    }

    @Test
    public void testSetTema() {
        documental.setTema("Physics");
        assertEquals("Physics", documental.getTema());
    }

    @Test
    public void testMostrarDetalles() {
        documental.mostrarDetalles();
    }
}
