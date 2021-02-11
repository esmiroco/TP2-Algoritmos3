package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import bloque.BloqueLapizArriba;
import personaje.Personaje;

public class BloqueLapizArribaTest {
	
	@Test
	public void test01SeCreaBloqueNoNull() {
		BloqueLapizArriba bloque = new BloqueLapizArriba();
		
		assertNotNull(bloque);
	}
	
	@Test
	public void test02SeCreaElBloqueYSeEjecutaConElPersonaje() {
		Personaje mockPersonaje = mock(Personaje.class);
		BloqueLapizArriba bloque = new BloqueLapizArriba();
		
		bloque.ejecutar(mockPersonaje);
		
		verify(mockPersonaje).levantarLapiz();
	}
	
	
}
