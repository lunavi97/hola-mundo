package loom.hola_mundo;

/*
 * @author lunavi97
 * Devuelve el saludo a una persona en particular o de manera genérica si no se indica.
 */
public class HolaMundo {

	/*
	 * Saludar.
	 * 
	 * @param nombre de la persona a saludar.
	 * @return mensaje de saludo.
	 */
	public String saludar(final String persona) {
		return persona == "" ? "¡Hola!" : "¡Hola, " + persona.trim() + "!";
	}

	/*
	 * Saludar.
	 * 
	 * @return saludo genérico.
	 */
	public String saludar() {
		return "¡Hola!";
	}
}