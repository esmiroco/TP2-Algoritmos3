package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;


import personaje.Personaje;
import posicion.Posicion;


public class PersonajeTest {
	@Test
	public void test01CreoPersonajeNoNulo() {
		Personaje personaje = new Personaje();
		
		assertNotNull(personaje);
		
	}
	
	@Test
	public void test02CreoPersonajeConLapizArribaAlMoverseNoPintaPosicionNueva() {
		Personaje personaje = new Personaje();
		Posicion mockPosicion = mock(Posicion.class);
		personaje.mover(mockPosicion);
		
		verify(mockPosicion, never()).pintate();
		
		}
	
	@Test
	public void test03SeBajaLapizDePersonajeYSePintaPosicionAlMoverse() {
		Personaje personaje = new Personaje();
		Posicion mockPosicion = mock(Posicion.class);
		
		personaje.bajarLapiz();
		
		personaje.mover(mockPosicion);
		
		verify(mockPosicion).pintate();
		}
	
	@Test
	public void test04SeLevantaLapizYaLevantadoYNoCambiaComportamiento() {
		Personaje personaje = new Personaje();
		Posicion mockPosicion = mock(Posicion.class);
		
		personaje.mover(mockPosicion);
		
		verify(mockPosicion, never()).pintate();
		
		personaje.levantarLapiz();
		
		personaje.mover(mockPosicion);
		verify(mockPosicion, never()).pintate();
	}

	@Test
	public void test05SeBajaLapizYaBajoYNoCambiaComportamiento() {
		Personaje personaje = new Personaje();
		Posicion mockPosicion1 = mock(Posicion.class);
		Posicion mockPosicion2 = mock(Posicion.class);
		
		personaje.bajarLapiz();
		personaje.mover(mockPosicion1);
		
		verify(mockPosicion1).pintate();
		
		personaje.bajarLapiz();
		
		personaje.mover(mockPosicion2);
		verify(mockPosicion2).pintate();
		}
}
