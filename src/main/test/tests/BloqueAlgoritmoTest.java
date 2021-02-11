package tests;
import bloque.*;
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

            //Voy a la posicion (0,1)
            algoritmoPersonalizado.agregarBloque(bloqDerecha);
            //Voy a la posicion (1,1)
            algoritmoPersonalizado.agregarBloque(bloqArriba);
            //Voy a la posicion (0,1)
            algoritmoPersonalizado.agregarBloque(bloqIzquierda);


            Posicion posicion = new Posicion(0,0);
            Personaje unPj = new Personaje(posicion, tablero);


            algoritmoPersonalizado.ejecutar(unPj);
            Posicion posicion1 = new Posicion(0,1);

            assertEquals(true, posicion.esIgualA(posicion1));
    }

    @Test
    public void test02PrueboInsertarTodosLosBloquesEnElAlgoritmoPersonalizado(){
        Tablero tablero = new Tablero();
        BloqueAlgoritmo algoritmoPersonalizado = new BloqueAlgoritmo();

        BloqueLapizAbajo bloqLapizAbajo = new BloqueLapizAbajo();
        BloqueLapizArriba bloqLapizArriba = new BloqueLapizArriba();
        BloqueMovimiento bloqDerecha = new BloqueMovimiento(new MovDerecha());
        BloqueMovimiento bloqArriba = new BloqueMovimiento(new MovArriba());
        BloqueMovimiento bloqIzquierda = new BloqueMovimiento(new MovIzquierda());
        BloqueMovimiento bloqAbajo = new BloqueMovimiento(new MovAbajo());
        BloqueRepetirTresVeces bloqueRepTres = new BloqueRepetirTresVeces(new MovArriba());
        BloqueMovimiento bloqDerecha2 = new BloqueMovimiento(new MovDerecha());
        
        BloqueRepetirDosVeces bloqueRepDos = new BloqueRepetirDosVeces(bloqDerecha2);


        //(0,3)
        algoritmoPersonalizado.agregarBloque(bloqueRepTres);

        //(2,3)
        algoritmoPersonalizado.agregarBloque(bloqueRepDos);

        algoritmoPersonalizado.agregarBloque(bloqLapizArriba);
        algoritmoPersonalizado.agregarBloque(bloqLapizAbajo);

        //(3,3)
        algoritmoPersonalizado.agregarBloque(bloqDerecha);

        //(3,4)
        algoritmoPersonalizado.agregarBloque(bloqArriba);

        //(6,4)
        algoritmoPersonalizado.agregarBloque(new BloqueRepetirTresVeces(new MovDerecha()));

        //(6,3)
        algoritmoPersonalizado.agregarBloque(bloqAbajo);

        //(5,3)
        algoritmoPersonalizado.agregarBloque(bloqIzquierda);

        Posicion posicion = new Posicion(0,0);
        Personaje unPj = new Personaje(posicion, tablero);


        algoritmoPersonalizado.ejecutar(unPj);
        Posicion posicion1 = new Posicion(5,3);

        assertEquals(true, posicion.esIgualA(posicion1));

    }

    @Test
    public void test03CreoUnAlgoritmoPersonalizadoSinBloqueYNoDeberiaHacerNada() {
        Tablero tablero = new Tablero();
        BloqueAlgoritmo algoritmoPersonalizado = new BloqueAlgoritmo();

        Posicion posicion = new Posicion(1,1);
        Personaje unPj = new Personaje(posicion, tablero);

        algoritmoPersonalizado.ejecutar(unPj);
        Posicion posicion1 = new Posicion(1,1);

        assertEquals(true, posicion.esIgualA(posicion1));
    }

}
