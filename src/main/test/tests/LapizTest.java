package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import lapiz.Lapiz;
import lapiz.NoSePintaConLapizArribaException;
import posicion.Posicion;

public class LapizTest {
	
	@Test
	public void test01CreoLapizeNoNulo() {
		Lapiz lapiz = new Lapiz();

		assertNotNull(lapiz);

	}
	
}