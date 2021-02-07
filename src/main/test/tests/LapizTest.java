package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import lapiz.Lapiz;
import posicion.Posicion;

public class LapizTest {
	
	@Test
	public void test01CreoLapizeNoNulo() {
		Lapiz lapiz = new Lapiz();
		
		assertNotNull(lapiz);
		
	}
	
	@Test
	public void test02SeCreaLapizArribaSinPintarLasPosicionesQueSeLeDan() {
		Posicion mockPosicion = mock(Posicion.class);
		Posicion mockPosicionPrevia = mock(Posicion.class);

		Lapiz lapiz = new Lapiz();
		lapiz.pintar(mockPosicionPrevia, mockPosicion);
		
		verify(mockPosicion, never()).pintate();
		
	}
	
	@Test
	public void test03SeBajaElLapizRecienCreadoYPintaLasPosicionesQueSeLeDan() {
		
		Posicion mockPosicion = mock(Posicion.class);
		Posicion mockPosicionPrevia = mock(Posicion.class);
		Lapiz lapiz = new Lapiz();
		
		lapiz.pintar(mockPosicionPrevia, mockPosicion);
		
		verify(mockPosicion, never()).pintate();
		
		lapiz.bajarLapiz();
		
		lapiz.pintar(mockPosicionPrevia, mockPosicion);
		verify(mockPosicion).pintate();
	}
	
}