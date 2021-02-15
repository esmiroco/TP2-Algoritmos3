package tests;

import bloque.BloqueLapizAbajo;
import bloque.BloqueMovimiento;
import mapa.Mapa;
import movimiento.MovDerecha;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import bloque.BloqueLapizArriba;
import personaje.Personaje;
import posicion.Posicion;

public class BloqueLapizArribaTest {
	
	@Test
	public void test01SeCreaBloqueNoNull() {
		BloqueLapizArriba bloque = new BloqueLapizArriba();
		
		assertNotNull(bloque);
	}
	
	@Test
	public void test02SeCreaElBloqueYSeEjecutaConElPersonaje() {
		Posicion mockPosicion = new Posicion(1,1);
		Personaje unPersonaje = new Personaje(mockPosicion);
		BloqueLapizArriba bloque = new BloqueLapizArriba();
		Mapa unMapa = new Mapa();

		bloque.ejecutar(unPersonaje, unMapa);

		MovDerecha movimiento = new MovDerecha();
		BloqueMovimiento bloqueMover = new BloqueMovimiento(movimiento);

		bloqueMover.ejecutar(unPersonaje, unMapa);

		assertFalse(unPersonaje.obtenerPosicion().estoyPintado());
	}
}
