package tests;
import bloque.*;
import mapa.Mapa;
import movimiento.MovAbajo;
import movimiento.MovArriba;
import movimiento.MovDerecha;
import movimiento.MovIzquierda;
import org.junit.jupiter.api.Test;
import personaje.Personaje;
import posicion.Posicion;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BloqueAlgoritmoTest {
    @Test
    public void test01CreoUnBloqueAlgoritmoPersonalizadoRecorriendoUnCuadradoYDeberiaVolverALaPosicionOriginal() {
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
            Personaje unPj = new Personaje(posicion);
            Mapa unMapa = new Mapa();


            algoritmoPersonalizado.ejecutar(unPj,unMapa);
            Posicion posicion1 = new Posicion(0,1);

            assertEquals(true, unPj.obtenerPosicion().esIgualA(posicion1));
    }

    @Test
    public void test02PrueboInsertarTodosLosBloquesEnElAlgoritmoPersonalizado(){
        BloqueAlgoritmo algoritmoPersonalizado = new BloqueAlgoritmo();

        BloqueLapizAbajo bloqLapizAbajo = new BloqueLapizAbajo();
        BloqueLapizArriba bloqLapizArriba = new BloqueLapizArriba();
        BloqueMovimiento bloqDerecha = new BloqueMovimiento(new MovDerecha());
        BloqueMovimiento bloqArriba = new BloqueMovimiento(new MovArriba());
        BloqueMovimiento bloqIzquierda = new BloqueMovimiento(new MovIzquierda());
        BloqueMovimiento bloqAbajo = new BloqueMovimiento(new MovAbajo());
        BloqueRepetir bloqueRepTres = new BloqueRepetir(bloqArriba,3);
        BloqueMovimiento bloqDerecha2 = new BloqueMovimiento(new MovDerecha());
        
        BloqueRepetir bloqueRepDos = new BloqueRepetir(bloqDerecha2,2);


        algoritmoPersonalizado.agregarBloque(bloqueRepTres);

        algoritmoPersonalizado.agregarBloque(bloqueRepDos);

        algoritmoPersonalizado.agregarBloque(bloqLapizArriba);
        algoritmoPersonalizado.agregarBloque(bloqLapizAbajo);

        algoritmoPersonalizado.agregarBloque(bloqDerecha);

        algoritmoPersonalizado.agregarBloque(bloqArriba);


        algoritmoPersonalizado.agregarBloque(new BloqueRepetir(bloqArriba,3));
        //(6,4)
        algoritmoPersonalizado.agregarBloque(new BloqueRepetir(bloqDerecha,3));

        algoritmoPersonalizado.agregarBloque(bloqAbajo);

        algoritmoPersonalizado.agregarBloque(bloqIzquierda);

        Posicion posicion = new Posicion(0,0);
        Personaje unPj = new Personaje(posicion);
        Mapa unMapa = new Mapa();


        algoritmoPersonalizado.ejecutar(unPj, unMapa);
        Posicion posicion1 = new Posicion(5,6);

        assertEquals(true, unPj.obtenerPosicion().esIgualA(posicion1));

    }

    @Test
    public void test03CreoUnAlgoritmoPersonalizadoSinBloqueYNoDeberiaHacerNada() {
        BloqueAlgoritmo algoritmoPersonalizado = new BloqueAlgoritmo();

        Posicion posicion = new Posicion(1,1);
        Personaje unPj = new Personaje(posicion);
        Mapa unMapa = new Mapa();

        algoritmoPersonalizado.ejecutar(unPj, unMapa);
        Posicion posicion1 = new Posicion(1,1);

        assertEquals(true, unPj.obtenerPosicion().esIgualA(posicion1));
    }

}
