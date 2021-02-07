
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
import tablero.Tablero;

public class BloqueMovimientoTest {

    @Test
    public void test01BloqueConMovimientoALaDerechaMueveUnaPosicion(){
    	Tablero tablero = new Tablero();
        MovDerecha movDerecha = new MovDerecha();
        BloqueMovimiento bloqueDerecha = new BloqueMovimiento(movDerecha);
        Posicion posicion = new Posicion(0,0);
        Personaje personaje = new Personaje(posicion, tablero);

        bloqueDerecha.ejecutar(personaje);

        Posicion posicion1 = new Posicion(1,0);

        assertEquals(true, posicion.esIgualA(posicion1));


    }

    @Test
    public void test02BloqueConMovimientoALaIzquierdaMueveUnaPosicion(){
    	Tablero tablero = new Tablero();
        MovIzquierda movIzquierda = new MovIzquierda();
        BloqueMovimiento bloqueIzquierda = new BloqueMovimiento(movIzquierda);
        Posicion posicion = new Posicion(2,2);
        Personaje personaje = new Personaje(posicion, tablero);

        bloqueIzquierda.ejecutar(personaje);

        Posicion posicion1 = new Posicion(1,2);

        assertEquals(true, posicion.esIgualA(posicion1));

    }

    @Test
    public void test03BloqueConMovimientoArribaMueveUnaPosicion(){
    	Tablero tablero = new Tablero();
        MovArriba movArriba = new MovArriba();
        BloqueMovimiento bloqueArriba = new BloqueMovimiento(movArriba);
        Posicion posicion = new Posicion(2, 2);
        Personaje personaje = new Personaje(posicion, tablero);

        bloqueArriba.ejecutar(personaje);

        Posicion posicion1 = new Posicion(2,3);

        assertEquals(true, posicion.esIgualA(posicion1));


    }

    @Test
    public void test04BloqueConMovimientoAbajoMueveUnaPosicion(){
        MovAbajo movAbajo = new MovAbajo();
        BloqueMovimiento bloqueAbajo = new BloqueMovimiento(movAbajo);
        Tablero tablero = new Tablero();
        Posicion posicion = new Posicion(2,2);
        Personaje personaje = new Personaje(posicion, tablero);

        bloqueAbajo.ejecutar(personaje);

        Posicion posicion1 = new Posicion(2,1);

        assertEquals(true, posicion.esIgualA(posicion1));


    }
}
