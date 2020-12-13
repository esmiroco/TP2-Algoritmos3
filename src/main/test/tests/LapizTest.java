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
	public void test02SeCreaLapizAbajoPintandoLasPosicionesQueSeLeDan() {
		Lapiz lapiz = new Lapiz();
		
		Posicion mockPosicion = mock(Posicion.class);
		
		lapiz.pintar(mockPosicion);
		
		verify(mockPosicion).pintate();
		
	}
	
	@Test
	public void test03SeLevantaElLapizYNoPintaLasPosicionesQueSeLeDan() {
		
		Posicion mockPosicion = mock(Posicion.class);
		Lapiz lapiz = new Lapiz();
		
		lapiz.levantarLapiz();
		
		lapiz.pintar(mockPosicion);
		
		verify(mockPosicion, never()).pintate();
		
	}
	
	@Test
	public void test04SeLevantaElLapizYNoPintaLasPosicionesPeroLuegoSeBajaYLasPinta() {
		
		Posicion mockPosicion = mock(Posicion.class);
		Lapiz lapiz = new Lapiz();
		
		lapiz.levantarLapiz();
		
		lapiz.pintar(mockPosicion);
		
		verify(mockPosicion, never()).pintate();
		
		lapiz.bajarLapiz();
		
		lapiz.pintar(mockPosicion);
		verify(mockPosicion).pintate();
	}
}