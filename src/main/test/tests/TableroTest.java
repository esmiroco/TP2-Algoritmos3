package tests;

import org.junit.jupiter.api.Test;
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
}
