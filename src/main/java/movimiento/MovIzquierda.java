package movimiento;

import mapa.Mapa;
import posicion.Posicion;

public class MovIzquierda implements Movimiento {
    public Posicion actualizarPosicion(Posicion posicion, Mapa mapa){
        posicion=mapa.moverIzquierda(posicion);
        return posicion;
    }

    public Movimiento obtenerMovimientoInvertido() {
        return new MovDerecha();
    }
}
