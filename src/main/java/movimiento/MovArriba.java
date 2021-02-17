package movimiento;

import posicion.Posicion;

public class MovArriba implements Movimiento {
    public void actualizarPosicion(Posicion posicion){
        posicion.moverArriba();
    }
    public Movimiento obtenerMovimientoInvertido() {
        return new MovAbajo();
    }
}
