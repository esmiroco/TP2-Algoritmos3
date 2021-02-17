package movimiento;

import posicion.Posicion;

public class MovIzquierda implements Movimiento {
    public void actualizarPosicion(Posicion posicion){
        posicion.moverIzquierda();
    }

    public Movimiento obtenerMovimientoInvertido() {
        return new MovDerecha();
    }
}
