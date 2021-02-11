package tests;

import org.junit.jupiter.api.Test;

import bloque.BloqueLapizAbajo;
import bloque.BloqueMovimiento;
import movimiento.MovArriba;
import personaje.Personaje;
import tablero.Tablero;
import posicion.Posicion;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TableroTest {

    @Test
    public void test01SeVeificaPosicionAlmacenadaEnTablero(){
        Posicion posicion = new Posicion(1,0);
        Tablero tablero = new Tablero();
        tablero.almacenarPosicion(posicion);

        assertTrue(tablero.existePosicion(posicion));
    }
    
    @Test
    public void test02SeBajaElLapizRecienCreadoYPintaLasPosicionesQueSeLeDan() {
		Tablero tablero = new Tablero();
		Posicion posicion = new Posicion(1, 1);
		Posicion ultimaPosicion = new Posicion(1, 3);
		Personaje personaje = new Personaje(posicion, tablero);
		
		BloqueMovimiento movimiento = new BloqueMovimiento(new MovArriba());
		BloqueMovimiento movimiento2 = new BloqueMovimiento(new MovArriba());
		BloqueLapizAbajo abajo = new BloqueLapizAbajo();
		
		movimiento.ejecutar(personaje);
		abajo.ejecutar(personaje);
		movimiento2.ejecutar(personaje);
		
		assertTrue(tablero.existePosicion(ultimaPosicion));

	}
}
