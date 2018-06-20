package loom.hola_mundo;

/*
 * @author lunavi97
 * 
 * Devuelve el saludo a una persona en particular
 * o de manera genérica si no se indica
 */

public class HolaMundo {

    public String saludar(final String persona) {
    	
    	/*
    	 * Saludar
    	 * 
    	 * @param persona: nombre de la persona a saludar
    	 * @return mensaje de saludo
    	 */
    	
        if(persona == "") {
        	return "¡Hola!";
        } else {
        	return "¡Hola, " + persona.trim() + "!";
        }
    }
    
    public String saludar() {
    	/*
    	 * Saludar
    	 * 
    	 * @return saludo genérico
    	 */
    	
    	return "¡Hola!";
    }
}
