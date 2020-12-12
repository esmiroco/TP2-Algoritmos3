package PersonajeTest;

import org.junit.jupiter.api.Test;

import Personaje.Personaje;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonajeTest {
	@Test
	public void creoPersonajeNoNulo() {
		Personaje personaje = new Personaje();
		
		assertNotNull(personaje);
		
	}
	
/*	@Test
	public void creoPersonajeConLapizArriba() {
		Personaje personaje = new Personaje();
		
		
		}*/
}
