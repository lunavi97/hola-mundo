package loom.hola_mundo;

/*
 * Devuelve el saludo a una persona en particular
 * o de manera genérica si no se indica
 */

public class HolaMundo {

    public String saludar(final String persona) {
    	
    	/*
    	 * @param persona: nombre de la persona a saludar
    	 * @return mensaje de saludo
    	 */
    	
        return persona != "" ? "¡Hola, " + persona + "!" : "¡Hola!";
    }
}
