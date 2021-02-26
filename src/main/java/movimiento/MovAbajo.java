package movimiento;

import mapa.Mapa;
import posicion.Posicion;

public class MovAbajo implements Movimiento {
    public Posicion actualizarPosicion(Posicion posicion, Mapa mapa){
        posicion=mapa.obtenerPosicionAbajo(posicion);
        return posicion;
    }

    @Override
    public Movimiento obtenerMovimientoInvertido() {
        return new MovArriba();
    }
}
