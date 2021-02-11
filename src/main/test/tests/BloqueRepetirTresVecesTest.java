package tests;

import bloque.BloqueRepetirTresVeces;
import movimiento.MovArriba;
import org.junit.jupiter.api.Test;
import personaje.Personaje;
import posicion.Posicion;
import tablero.Tablero;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloqueRepetirTresVecesTest {

    @Test
    public void test01BloqueRepetirTresVecesDeberiaRepetirElMovimiento() {
        Tablero tablero = new Tablero();
        MovArriba movArriba = new MovArriba();
        BloqueRepetirTresVeces bloqueRep = new BloqueRepetirTresVeces(movArriba);
        Posicion posicion = new Posicion(0,0);
        Personaje personaje = new Personaje(posicion, tablero);

        bloqueRep.ejecutar(personaje);

        Posicion posicion1 = new Posicion(0,3);

        assertEquals(true, posicion.esIgualA(posicion1));
    }
}
