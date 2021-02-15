package movimiento;

import mapa.Mapa;
import posicion.Posicion;

public class MovDerecha implements Movimiento {
    public Posicion actualizarPosicion(Posicion posicion, Mapa mapa){
        posicion = mapa.moverDerecha(posicion);
        return posicion;
    }

    public Movimiento obtenerMovimientoInvertido() {
        return new MovIzquierda();
    }
}
