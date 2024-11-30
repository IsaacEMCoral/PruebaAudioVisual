package model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PodcastTest {
    private Podcast podcast;

    //Inicializacion de los elementos para el test
    @Before
    public void setUp() {
        podcast = new Podcast("Clooless", 88, "Commedy", "Chatting", "Clooless Podcast");
    }

    //Comparacion de los datos conocidos con los datos guardadoos en las variables
    @Test
    public void testGetProductor() {
        assertEquals("Clooless Podcast", podcast.getNombreCanal());
    }

    @Test
    public void testSetProductor() {
        podcast.setNombreCanal("Joe Rogan");
        assertEquals("Joe Rogan", podcast.getNombreCanal());
    }

    @Test
    public void testMostrarDetalles() {
        podcast.mostrarDetalles();
    }
}
