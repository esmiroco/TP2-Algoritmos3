package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import lapiz.Lapiz;
import posicion.Posicion;
import tablero.Tablero;

public class LapizTest {
	
	@Test
	public void test01CreoLapizeNoNulo() {
		Lapiz lapiz = new Lapiz();
		
		assertNotNull(lapiz);
		
	}
	
	@Test
	public void test02SeCreaLapizArribaSinPintarLasPosicionesQueSeLeDan() {
		Tablero mockTablero = mock(Tablero.class);
		Posicion mockPosicion = mock(Posicion.class);
		Posicion mockPosicionPrevia = mock(Posicion.class);

		Lapiz lapiz = new Lapiz();
		lapiz.pintar(mockPosicionPrevia, mockPosicion, mockTablero);
		
		verify(mockTablero, never()).almacenarPosicion(mockPosicion);
		
	}
	
	@Test
	public void test03SeBajaElLapizRecienCreadoYPintaLasPosicionesQueSeLeDan() {
		Tablero mockTablero = mock(Tablero.class);
		Posicion mockPosicion = mock(Posicion.class);
		Posicion mockPosicionPrevia = mock(Posicion.class);
		Lapiz lapiz = new Lapiz();
		
		lapiz.pintar(mockPosicionPrevia, mockPosicion, mockTablero);
		
		verify(mockTablero, never()).almacenarPosicion(mockPosicion);
		
		lapiz.bajarLapiz();
		
		lapiz.pintar(mockPosicionPrevia, mockPosicion, mockTablero);
		verify(mockTablero).almacenarPosicion(mockPosicion);
	}
	
}