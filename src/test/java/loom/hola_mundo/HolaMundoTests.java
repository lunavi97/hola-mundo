package loom.hola_mundo;

import org.junit.Assert;
import org.junit.Test;

public class HolaMundoTests {
    @Test
    public void queSaludaCorrectamente() {
        HolaMundo holaMundo = new HolaMundo();
        Assert.assertEquals("¡Hola, Kent Beck!", holaMundo.saludar("Kent Beck"));
    }
    
    @Test
    public void sinPersona() {
    	HolaMundo holaMundo = new HolaMundo();
    	Assert.assertEquals("¡Hola!", holaMundo.saludar(""));
    }
}
