package model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class InvestigadorTest {
    private Investigador investigador;
    
    //Inicializacion de los elementos para el test
    @Before
    public void setUp() {
        investigador = new Investigador("Neil deGrasse Tyson");
    }

    //Comparacion de los datos conocidos con los datos guardadoos en las variables
    @Test
    public void testGetNombreInvestigador() {
        assertEquals("Neil deGrasse Tyson", investigador.getNombreInvestigador());
    }

    @Test
    public void testSetNombreInvestigador() {
        investigador.setNombreInvestigador("Mateo Franco");
        assertEquals("Mateo Franco", investigador.getNombreInvestigador());
    }

    @Test
    public void testMostrarDetalles() {
        investigador.mostrarDetalles();
    }
}
