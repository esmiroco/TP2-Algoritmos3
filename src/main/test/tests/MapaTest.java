package tests;

import mapa.Mapa;
import posicion.Posicion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapaTest {
    @Test
    public void tes01SeCreaUnaPosicionYSeMueveALaDerecha(){
        Posicion posicion = new Posicion (0,0);
        Posicion nuevaPosicion;
        Mapa mapa = new Mapa();
        nuevaPosicion = mapa.moverDerecha(posicion);

        assertEquals(false, nuevaPosicion.esIgualA(posicion));

        Posicion posicionEsperada = new Posicion(1,0);

        assertEquals(true, nuevaPosicion.esIgualA(posicionEsperada));
    }
}
