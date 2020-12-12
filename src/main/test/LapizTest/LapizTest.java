package LapizTest;

import org.junit.jupiter.api.Test;

import Lapiz.Lapiz;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LapizTest {
	@Test
	public void creoLapizeNoNulo() {
		Lapiz lapiz = new Lapiz();
		
		assertNotNull(lapiz);
		
	}
}