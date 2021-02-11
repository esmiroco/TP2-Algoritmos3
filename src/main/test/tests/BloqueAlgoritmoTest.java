package tests;
import bloque.BloqueAlgoritmo;
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

public class BloqueAlgoritmoTest {
    @Test
        public void test01CreoUnBloqueAlgoritmoPersonalizadoRecorriendoUnCuadradoYDeberiaVolverALaPosicionOriginal() {
            Tablero tablero = new Tablero();
            BloqueAlgoritmo algoritmoPersonalizado = new BloqueAlgoritmo();
           /* MovDerecha movDerecha = new MovDerecha();
            MovArriba movArriba = new MovArriba();
            MovIzquierda movIzquierda = new MovIzquierda();
            MovAbajo movAbajo = new MovAbajo();*/

            BloqueMovimiento bloqDerecha = new BloqueMovimiento(new MovDerecha());
            BloqueMovimiento bloqArriba = new BloqueMovimiento(new MovArriba());
            BloqueMovimiento bloqIzquierda = new BloqueMovimiento(new MovIzquierda());
            BloqueMovimiento bloqAbajo = new BloqueMovimiento(new MovAbajo());

            algoritmoPersonalizado.agregarBloque(bloqDerecha);
            algoritmoPersonalizado.agregarBloque(bloqArriba);
            algoritmoPersonalizado.agregarBloque(bloqIzquierda);
            algoritmoPersonalizado.agregarBloque(bloqAbajo);

            Posicion posicion = new Posicion(0,0);
            Personaje unPj = new Personaje(posicion, tablero);


            algoritmoPersonalizado.ejecutar(unPj);
            Posicion posicion1 = new Posicion(0,0);

            assertEquals(true, posicion.esIgualA(posicion1));
        }

}
