package mapa;

import posicion.Posicion;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
    private List<Posicion> posiciones;

    public Mapa() {
        posiciones = new ArrayList<Posicion>();
    }


    public Posicion checkearYDevolverPosicion(Posicion posicion) {
        for (Posicion pos : posiciones) {
            if (posicion.esIgualA(pos)) {
                return pos;
            }
        }
        posiciones.add(posicion);
        return posicion;
    }

    public Posicion moverAbajo(Posicion posicion) {
        int nuevaY = posicion.obtenerY();
        nuevaY = nuevaY - 1;
        Posicion nuevaPosicion = new Posicion(posicion.obtenerX(), nuevaY);
        return checkearYDevolverPosicion(nuevaPosicion);
    }

    public Posicion moverArriba(Posicion posicion) {
        int nuevaY = posicion.obtenerY();
        nuevaY = nuevaY + 1;
        Posicion nuevaPosicion = new Posicion(posicion.obtenerX(), nuevaY);
        return checkearYDevolverPosicion(nuevaPosicion);
    }

    public Posicion moverDerecha(Posicion posicion) {
        int nuevaX = posicion.obtenerX();
        nuevaX = nuevaX + 1;
        Posicion nuevaPosicion = new Posicion(nuevaX, posicion.obtenerY());
        return checkearYDevolverPosicion(nuevaPosicion);
    }

    public Posicion moverIzquierda(Posicion posicion) {
        int nuevaX = posicion.obtenerX();
        nuevaX = nuevaX - 1;
        Posicion nuevaPosicion = new Posicion(nuevaX, posicion.obtenerY());
        return checkearYDevolverPosicion(nuevaPosicion);
    }



}