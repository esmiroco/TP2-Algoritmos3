package tests;

import org.junit.jupiter.api.Test;

import movimiento.Movimiento;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;


import personaje.Personaje;
import posicion.Posicion;


public class PersonajeTest {
	@Test
	public void test01CreoPersonajeNoNulo() {
		Posicion mockPosicion = mock(Posicion.class);
		Personaje personaje = new Personaje(mockPosicion);
		
		assertNotNull(personaje);
		
	}
	
	@Test
	public void test02CreoPersonajeConLapizArribaAlMoverseNoPintaPosicionNueva() {
		Posicion mockPosicion = mock(Posicion.class);
		Movimiento mockMovimiento = mock(Movimiento.class);
		Personaje personaje = new Personaje(mockPosicion);
		personaje.mover(mockMovimiento);
		
		verify(mockPosicion, never()).pintate();
		
		}
	
	@Test
	public void test03SeBajaLapizDePersonajeYSePintaPosicionAlMoverse() {
		Movimiento mockMovimiento = mock(Movimiento.class);
		Posicion mockPosicion = mock(Posicion.class);
		Personaje personaje = new Personaje(mockPosicion);
		
		personaje.bajarLapiz();
		
		personaje.mover(mockMovimiento);
		
		verify(mockPosicion).pintate();
		}
	
	@Test
	public void test04SeLevantaLapizYaLevantadoYNoCambiaComportamiento() {
		Movimiento mockMovimiento = mock(Movimiento.class);
		Posicion mockPosicion = mock(Posicion.class);
		Personaje personaje = new Personaje(mockPosicion);
		
		personaje.mover(mockMovimiento);
		
		verify(mockPosicion, never()).pintate();
		
		personaje.levantarLapiz();
		
		personaje.mover(mockMovimiento);
		verify(mockPosicion, never()).pintate();
	}

	@Test
	public void test05SeBajaLapizYaBajoYNoCambiaComportamiento() {
		Movimiento mockMovimiento = mock(Movimiento.class);
		Posicion mockPosicion = mock(Posicion.class);
		Personaje personaje = new Personaje(mockPosicion);
		
		personaje.bajarLapiz();
		personaje.mover(mockMovimiento);
		
		verify(mockPosicion).pintate();
		
		personaje.bajarLapiz();
		
		personaje.mover(mockMovimiento);
		verify(mockPosicion, times(2)).pintate();
		}
}
