package mapa;

import posicion.Posicion;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
    private List<Posicion> posiciones;

    public Mapa() {
        posiciones = new ArrayList<Posicion>();
    }


    private Posicion agregarYDevolver(Posicion posicion) {
        for (Posicion pos : posiciones) {
            if (posicion.esIgualA(pos)) {
                return pos;
            }
        }
        posiciones.add(posicion);
        return posicion;
    }

    public Posicion obtenerPosicionAbajo(Posicion posicion) {
        int nuevaY = posicion.obtenerY();
        nuevaY = nuevaY + 1;
        Posicion nuevaPosicion = new Posicion(posicion.obtenerX(), nuevaY);
        nuevaPosicion = agregarYDevolver(nuevaPosicion);
        return nuevaPosicion;
    }

    public Posicion moverArriba(Posicion posicion) {
        int nuevaY = posicion.obtenerY();
        nuevaY = nuevaY - 1;
        Posicion nuevaPosicion = new Posicion(posicion.obtenerX(), nuevaY);
        return agregarYDevolver(nuevaPosicion);
    }

    public Posicion moverDerecha(Posicion posicion) {
        int nuevaX = posicion.obtenerX();
        nuevaX = nuevaX + 1;
        Posicion nuevaPosicion = new Posicion(nuevaX, posicion.obtenerY());
        return agregarYDevolver(nuevaPosicion);
    }

    public Posicion moverIzquierda(Posicion posicion) {
        int nuevaX = posicion.obtenerX();
        nuevaX = nuevaX - 1;
        Posicion nuevaPosicion = new Posicion(nuevaX, posicion.obtenerY());
        return agregarYDevolver(nuevaPosicion);
    }



}