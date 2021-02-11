package tests;

import bloque.BloqueMovimiento;
import bloque.BloqueRepetirDosVeces;
import movimiento.MovDerecha;
import org.junit.jupiter.api.Test;
import personaje.Personaje;
import posicion.Posicion;
import tablero.Tablero;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloqueRepetirDosVecesTest {

    @Test
    public void test01BloqueRepetirDosVecesSinMovimientoNoSeDeberiaMover() {
        Tablero tablero = new Tablero();
        MovDerecha movDerecha = new MovDerecha();
        BloqueMovimiento bloqueMov = new BloqueMovimiento(movDerecha);
        BloqueRepetirDosVeces bloqueRep = new BloqueRepetirDosVeces(bloqueMov);
        Posicion posicion = new Posicion(0,0);
        Personaje personaje = new Personaje(posicion, tablero);

        bloqueRep.ejecutar(personaje);

        Posicion posicion1 = new Posicion(2,0);

        assertEquals(true, posicion.esIgualA(posicion1));
    }
}
