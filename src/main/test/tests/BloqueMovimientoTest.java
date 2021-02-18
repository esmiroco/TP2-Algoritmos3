
package tests;

import bloque.BloqueMovimiento;
import mapa.Mapa;
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
    	Mapa mapa = new Mapa();
        MovDerecha movDerecha = new MovDerecha();
        BloqueMovimiento bloqueDerecha = new BloqueMovimiento(movDerecha);
        Posicion posicion = new Posicion(0,0);
        Personaje personaje = new Personaje(posicion);

        bloqueDerecha.ejecutar(personaje, mapa);

        Posicion posicion1 = new Posicion(1,0);

        assertEquals(true, posicion1.esIgualA(personaje.obtenerPosicion()));
    }

    @Test
    public void test02BloqueConMovimientoALaIzquierdaMueveUnaPosicion(){
        MovIzquierda movIzquierda = new MovIzquierda();
        BloqueMovimiento bloqueIzquierda = new BloqueMovimiento(movIzquierda);
        Posicion posicion = new Posicion(2,2);
        Personaje personaje = new Personaje(posicion);
        Mapa unMapa = new Mapa();

        bloqueIzquierda.ejecutar(personaje, unMapa);

        Posicion posicion1 = new Posicion(1,2);

        assertEquals(true, personaje.obtenerPosicion().esIgualA(posicion1));

    }

    @Test
    public void test03BloqueConMovimientoArribaMueveUnaPosicion(){
        MovArriba movArriba = new MovArriba();
        BloqueMovimiento bloqueArriba = new BloqueMovimiento(movArriba);
        Posicion posicion = new Posicion(2, 2);
        Personaje personaje = new Personaje(posicion);
        Mapa unMapa = new Mapa();

        bloqueArriba.ejecutar(personaje, unMapa);

        Posicion posicion1 = new Posicion(2, 1);

        assertEquals(true, personaje.obtenerPosicion().esIgualA(posicion1));


    }

    @Test
    public void test04BloqueConMovimientoAbajoMueveUnaPosicion(){
        MovAbajo movAbajo = new MovAbajo();
        BloqueMovimiento bloqueAbajo = new BloqueMovimiento(movAbajo);
        Posicion posicion = new Posicion(2,2);
        Personaje personaje = new Personaje(posicion);
        Mapa unMapa = new Mapa();

        bloqueAbajo.ejecutar(personaje, unMapa);

        Posicion posicion1 = new Posicion(2,3);

        assertEquals(true, personaje.obtenerPosicion().esIgualA(posicion1));


    }
}
