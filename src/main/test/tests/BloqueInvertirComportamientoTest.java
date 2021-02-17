package tests;

import bloque.BloqueInvertirComportamiento;
import bloque.BloqueMovimiento;
import movimiento.MovAbajo;
import movimiento.MovArriba;
import movimiento.MovDerecha;
import movimiento.MovIzquierda;
import org.junit.jupiter.api.Test;
import personaje.Personaje;
import posicion.Posicion;
import tablero.Tablero;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloqueInvertirComportamientoTest {
    @Test
    public void test01(){
        Tablero tablero = new Tablero();
        BloqueInvertirComportamiento bloqInvertir = new BloqueInvertirComportamiento();

        BloqueMovimiento bloqDerecha = new BloqueMovimiento(new MovDerecha());
        BloqueMovimiento bloqArriba = new BloqueMovimiento(new MovArriba());
        BloqueMovimiento bloqIzquierda = new BloqueMovimiento(new MovIzquierda());
        BloqueMovimiento bloqAbajo = new BloqueMovimiento(new MovAbajo());


        //(-1,0)
        bloqInvertir.agregarBloque(bloqDerecha);
        //
        bloqInvertir.agregarBloque(bloqArriba);
        bloqInvertir.agregarBloque(bloqIzquierda);
        //algoritmoPersonalizado.agregarBloque(bloqAbajo);

        Posicion posicion = new Posicion(0,0);
        Personaje unPj = new Personaje(posicion, tablero);


        bloqInvertir.ejecutar(unPj);
        Posicion posicion1 = new Posicion(0,-1);

        assertEquals(true, posicion.esIgualA(posicion1));
    }

}
