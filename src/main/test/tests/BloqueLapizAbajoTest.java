package tests;

import bloque.BloqueMovimiento;
import mapa.Mapa;
import movimiento.MovDerecha;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import bloque.BloqueLapizAbajo;
import personaje.Personaje;
import posicion.Posicion;

public class BloqueLapizAbajoTest {
	
	@Test
	public void test01SeCreaBloqueNoNull() {
		BloqueLapizAbajo bloque = new BloqueLapizAbajo();
		
		assertNotNull(bloque);
	}
	
	@Test
	public void test02SeCreaElBloqueYSeEjecutaConElPersonaje() {
		Posicion mockPosicion = new Posicion(1,1);
		Personaje unPersonaje = new Personaje(mockPosicion);
		BloqueLapizAbajo bloque = new BloqueLapizAbajo();
		Mapa unMapa = new Mapa();
		
		bloque.ejecutar(unPersonaje, unMapa);

		MovDerecha movimiento = new MovDerecha();
		BloqueMovimiento bloqueMover = new BloqueMovimiento(movimiento);

		bloqueMover.ejecutar(unPersonaje, unMapa);

		assertTrue(unPersonaje.obtenerPosicion().estoyPintado());
	}
}
