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

public class BloqueTest {

    @Test
    public void test01BloqueConMovimientoALaDerechaMueveUnaPosicion(){
            MovDerecha movDerecha = new MovDerecha();
            BloqueMovimiento bloqueDerecha = new BloqueMovimiento(movDerecha);
            Posicion posicion = new Posicion(0,0);
            Personaje personaje = new Personaje(posicion);

            bloqueDerecha.ejecutar(personaje);

            Posicion posicion1 = new Posicion(1,0);

            assertEquals(true, posicion.esIgualA(posicion1));


    }

    @Test
    public void test02BloqueConMovimientoALaIzquierdaMueveUnaPosicion(){
        MovIzquierda movIzquierda = new MovIzquierda();
        BloqueMovimiento bloqueIzquierda = new BloqueMovimiento(movIzquierda);
        Posicion posicion = new Posicion(2,2);
        Personaje personaje = new Personaje(posicion);

        bloqueIzquierda.ejecutar(personaje);

        Posicion posicion1 = new Posicion(1,2);

        assertEquals(true, posicion.esIgualA(posicion1));

    }

    @Test
    public void test03BloqueConMovimientoArribaMueveUnaPosicion(){
        MovArriba movArriba = new MovArriba();
        BloqueMovimiento bloqueArriba = new BloqueMovimiento(movArriba);
        Posicion posicion = new Posicion(2, 2);
        Personaje personaje = new Personaje(posicion);

        bloqueArriba.ejecutar(personaje);

        Posicion posicion1 = new Posicion(2,3);

        assertEquals(true, posicion.esIgualA(posicion1));


    }

    @Test
    public void test04BloqueConMovimientoAbajoMueveUnaPosicion(){
        MovAbajo movAbajo = new MovAbajo();
        BloqueMovimiento bloqueAbajo = new BloqueMovimiento(movAbajo);
        Posicion posicion = new Posicion(2,2);
        Personaje personaje = new Personaje(posicion);

        bloqueAbajo.ejecutar(personaje);

        Posicion posicion1 = new Posicion(2,1);

        assertEquals(true, posicion.esIgualA(posicion1));


    }
}
