package tests;

import org.junit.jupiter.api.Test;

import movimiento.Movimiento;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;


import personaje.Personaje;
import posicion.Posicion;
import tablero.Tablero;


public class PersonajeTest {
	@Test
	public void test01CreoPersonajeNoNulo() {
		Posicion mockPosicion = mock(Posicion.class);
		Tablero mockTablero = mock(Tablero.class);
		Personaje personaje = new Personaje(mockPosicion, mockTablero);
		
		assertNotNull(personaje);
		
	}
	
	@Test
	public void test02CreoPersonajeConLapizArribaAlMoverseNoPintaPosicionNueva() {
		Tablero mockTablero = mock(Tablero.class);
		Posicion mockPosicion = mock(Posicion.class);
		Movimiento mockMovimiento = mock(Movimiento.class);
		Personaje personaje = new Personaje(mockPosicion, mockTablero);
		personaje.mover(mockMovimiento);
		
		verify(mockPosicion, never()).pintate(mockTablero);
		
		}
	
	@Test
	public void test03SeBajaLapizDePersonajeYSePintaPosicionAlMoverse() {
		Tablero mockTablero = mock(Tablero.class);
		Movimiento mockMovimiento = mock(Movimiento.class);
		Posicion mockPosicion = mock(Posicion.class);
		Personaje personaje = new Personaje(mockPosicion, mockTablero);
		
		personaje.bajarLapiz();
		
		personaje.mover(mockMovimiento);
		
		verify(mockPosicion).pintate(mockTablero);
		}
	
	@Test
	public void test04SeLevantaLapizYaLevantadoYNoCambiaComportamiento() {
		Tablero mockTablero = mock(Tablero.class);
		Movimiento mockMovimiento = mock(Movimiento.class);
		Posicion mockPosicion = mock(Posicion.class);
		Personaje personaje = new Personaje(mockPosicion, mockTablero);
		
		personaje.mover(mockMovimiento);
		
		verify(mockPosicion, never()).pintate(mockTablero);
		
		personaje.levantarLapiz();
		
		personaje.mover(mockMovimiento);
		verify(mockPosicion, never()).pintate(mockTablero);
	}

	@Test
	public void test05SeBajaLapizYaBajoYNoCambiaComportamiento() {
		Tablero mockTablero = mock(Tablero.class);
		Movimiento mockMovimiento = mock(Movimiento.class);
		Posicion mockPosicion = mock(Posicion.class);
		Personaje personaje = new Personaje(mockPosicion, mockTablero);
		
		personaje.bajarLapiz();
		personaje.mover(mockMovimiento);
		
		verify(mockPosicion).pintate(mockTablero);
		
		personaje.bajarLapiz();
		
		personaje.mover(mockMovimiento);
		verify(mockPosicion, times(2)).pintate(mockTablero);
		}
}
