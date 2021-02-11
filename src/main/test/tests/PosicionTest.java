package tests;

import org.junit.jupiter.api.Test;
import posicion.Posicion;

import static org.junit.jupiter.api.Assertions.*;

public class PosicionTest {

    @Test
    public void test01SeComparanDosPosicionesDistintasDebeSerFalso() {
        Posicion posicion0 = new Posicion(0,0);
        Posicion posicion1 = new Posicion(0,1);
        assertEquals(false, posicion0.esIgualA(posicion1));
    }

    @Test
    public void test02SeComparanDosPosicionesIgualesDebeSerTrue() {
        Posicion posicion0 = new Posicion(0,0);
        Posicion posicion1 = new Posicion(0,0);
        assertEquals(true, posicion0.esIgualA(posicion1));
    }
}