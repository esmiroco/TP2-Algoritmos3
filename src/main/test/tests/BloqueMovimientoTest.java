package tests;

import bloque.BloqueMovimiento;
import movimiento.MovDerecha;
import movimiento.MovAbajo;
import movimiento.MovIzquierda;
import movimiento.MovArriba;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import personaje.Personaje;
import posicion.Posicion;

public class BloqueMovimientoTest {

    @Test
    public void test01BloqueConMovimientoALaDerechaMueveUnaPosicion(){
            MovDerecha movDerecha = new MovDerecha();
            BloqueMovimiento bloqueDerecha = new BloqueMovimiento(movDerecha);
            Posicion posicion = new Posicion(0,0);
            Personaje personaje = new Personaje(posicion);

            bloqueDerecha.ejecutar(personaje);

            assertEquals(1, posicion.obtenerX());
            assertEquals(0, posicion.obtenerY());


    }

    @Test
    public void test02BloqueConMovimientoALaIzquierdaMueveUnaPosicion(){
        MovIzquierda movIzquierda = new MovIzquierda();
        BloqueMovimiento bloqueIzquierda = new BloqueMovimiento(movIzquierda);
        Posicion posicion = new Posicion(2,2);
        Personaje personaje = new Personaje(posicion);

        bloqueIzquierda.ejecutar(personaje);

        assertEquals(1, posicion.obtenerX());
        assertEquals(2, posicion.obtenerY());


    }

    @Test
    public void test03BloqueConMovimientoArribaMueveUnaPosicion(){
        MovArriba movArriba = new MovArriba();
        BloqueMovimiento bloqueArriba = new BloqueMovimiento(movArriba);
        Posicion posicion = new Posicion(2, 2);
        Personaje personaje = new Personaje(posicion);

        bloqueArriba.ejecutar(personaje);

        assertEquals(2, posicion.obtenerX());
        assertEquals(3, posicion.obtenerY());


    }

    @Test
    public void test04BloqueConMovimientoAbajoMueveUnaPosicion(){
        MovAbajo movAbajo = new MovAbajo();
        BloqueMovimiento bloqueAbajo = new BloqueMovimiento(movAbajo);
        Posicion posicion = new Posicion(2,2);
        Personaje personaje = new Personaje(posicion);

        bloqueAbajo.ejecutar(personaje);

        assertEquals(2, posicion.obtenerX());
        assertEquals(1, posicion.obtenerY());

    }
}
