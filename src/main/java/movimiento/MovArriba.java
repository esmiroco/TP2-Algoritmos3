package movimiento;

import mapa.Mapa;
import posicion.Posicion;

public class MovArriba implements Movimiento {
    public Posicion actualizarPosicion(Posicion posicion, Mapa mapa){
        posicion=mapa.moverArriba(posicion);
        return posicion;
    }
    public Movimiento obtenerMovimientoInvertido() {
        return new MovAbajo();
    }
}
