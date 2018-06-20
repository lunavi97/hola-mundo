package loom.hola_mundo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HolaMundoTests {
	
	HolaMundo holaMundo;
	
	@Before
	public void inicialize() {
		holaMundo = new HolaMundo();
	}
	
    @Test
    public void queSaludaCorrectamente() {
        Assert.assertEquals("¡Hola, Kent Beck!", holaMundo.saludar("Kent Beck"));
    }
    
    @Test
    public void personaVacia() {
    	Assert.assertEquals("¡Hola!", holaMundo.saludar(""));
    }
    
    @Test
    public void sinPersona() {
    	Assert.assertEquals("¡Hola!", holaMundo.saludar());
    }
    
    @Test
    public void personaConEspaciosExtremos() {
    	Assert.assertEquals("¡Hola, Luis Martinez!", holaMundo.saludar(" Luis Martinez "));
    }
}
