package tests;

import mapa.Mapa;
import movimiento.MovDerecha;
import movimiento.MovIzquierda;
import org.junit.jupiter.api.Test;

import movimiento.Movimiento;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import personaje.Personaje;
import posicion.Posicion;


public class PersonajeTest {

    @Test
    public void test01CreoPersonajeNoNulo() {
        Posicion mockPosicion = new Posicion(1,1);
        Personaje personaje = new Personaje(mockPosicion);

        assertNotNull(personaje);

    }

    @Test
    public void test02CreoPersonajeConLapizArribaAlMoverseNoPintaPosicionNueva() {
        Posicion mockPosicion = new Posicion(1,1);
        MovDerecha mockMovimiento = new MovDerecha();
        Personaje personaje = new Personaje(mockPosicion);
        Mapa mapa=new Mapa();
        personaje.mover(mockMovimiento, mapa);

        assertFalse(personaje.obtenerPosicion().estoyPintado());

    }

    @Test
    public void test03SeBajaLapizDePersonajeYSePintaPosicionAlMoverse() {
        MovIzquierda mockMovimiento = new MovIzquierda();
        Posicion mockPosicion = new Posicion(1,2);
        Personaje personaje = new Personaje(mockPosicion);
        Mapa mapa=new Mapa();

        personaje.bajarLapiz();

        personaje.mover(mockMovimiento, mapa);

        assertTrue(personaje.obtenerPosicion().estoyPintado());
    }

    @Test
    public void test04SeLevantaLapizYaLevantadoYNoCambiaComportamiento() {
        MovDerecha mockMovimiento = new MovDerecha();
        Posicion mockPosicion = new Posicion(1,1);
        Personaje personaje = new Personaje(mockPosicion);
        Mapa mapa=new Mapa();

        personaje.mover(mockMovimiento, mapa);

        assertFalse(personaje.obtenerPosicion().estoyPintado());

        personaje.levantarLapiz();

        personaje.mover(mockMovimiento, mapa);
        assertFalse(personaje.obtenerPosicion().estoyPintado());
    }

    @Test
    public void test05SeBajaLapizYaBajoYNoCambiaComportamiento() {
        MovDerecha mockMovimiento = new MovDerecha();
        Posicion mockPosicion = new Posicion(2,2);
        Personaje personaje = new Personaje(mockPosicion);
        Mapa mapa=new Mapa();

        personaje.bajarLapiz();
        personaje.mover(mockMovimiento, mapa);

        assertTrue(personaje.obtenerPosicion().estoyPintado());

        personaje.bajarLapiz();

        personaje.mover(mockMovimiento, mapa);
        assertTrue(personaje.obtenerPosicion().estoyPintado());
    }
}
