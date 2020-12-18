package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import bloque.BloqueLapizAbajo;
import personaje.Personaje;

public class BloqueLapizAbajoTest {
	
	@Test
	public void test01SeCreaBloqueNoNull() {
		BloqueLapizAbajo bloque = new BloqueLapizAbajo();
		
		assertNotNull(bloque);
	}
	
	@Test
	public void test02SeCreaElBloqueYSeEjecutaConElPersonaje() {
		Personaje mockPersonaje = mock(Personaje.class);
		BloqueLapizAbajo bloque = new BloqueLapizAbajo();
		
		bloque.ejecutar(mockPersonaje);
		
		verify(mockPersonaje).bajarLapiz();
	}
}
