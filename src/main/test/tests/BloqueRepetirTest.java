package tests;

import bloque.BloqueMovimiento;
import bloque.BloqueRepetir;
import mapa.Mapa;
import movimiento.MovDerecha;
import org.junit.jupiter.api.Test;
import personaje.Personaje;
import posicion.Posicion;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloqueRepetirTest {
/*
    @Test
    public void test01BloqueRepetirDosVecesSinMovimientoNoSeDeberiaMover() {
        BloqueMovimiento bloqueMov = new BloqueMovimiento(new MovDerecha());
        BloqueRepetir bloqueRep = new BloqueRepetir(bloqueMov,2);
        Posicion posicion = new Posicion(0,0);
        Personaje personaje = new Personaje(posicion);
        Mapa unMapa = new Mapa();

        bloqueRep.ejecutar(personaje, unMapa);

        Posicion posicion1 = new Posicion(2,0);

        assertEquals(true, personaje.obtenerPosicion().esIgualA(posicion1));
    }

    @Test
    public void test02BloqueRepetirCon3Repeticiones() {
        BloqueMovimiento bloqueMov = new BloqueMovimiento(new MovDerecha());
        BloqueRepetir bloqueRep = new BloqueRepetir(bloqueMov,3);
        Posicion posicion = new Posicion(0,0);
        Personaje personaje = new Personaje(posicion);
        Mapa unMapa = new Mapa();

        bloqueRep.ejecutar(personaje, unMapa);

        Posicion posicion1 = new Posicion(3,0);

        assertEquals(true, personaje.obtenerPosicion().esIgualA(posicion1));
    }*/
}
