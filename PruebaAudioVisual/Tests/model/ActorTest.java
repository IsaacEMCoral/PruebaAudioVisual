package model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ActorTest {
    private Actor actor;

    //Inicializacion de los elementos para el test
    @Before
    public void setUp() {
        actor = new Actor("Sam Worthington");
    }

    //Comparacion de los datos conocidos con los datos guardados en las variables
    @Test
    public void testGetNombreActor() {
        assertEquals("Sam Worthington", actor.getNombreActor());
    }

    //Prueba al setter de la variable nombreActor
    @Test
    public void testSetNombreActor() {
        actor.setNombreActor("Tom Holland");
        assertEquals("Tom Holland", actor.getNombreActor());
    }

    @Test
    public void testMostrarDetalles() {
        actor.mostrarDetalles();
    }
}
