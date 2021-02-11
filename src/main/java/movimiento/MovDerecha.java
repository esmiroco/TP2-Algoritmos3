package movimiento;

import posicion.Posicion;

public class MovDerecha implements Movimiento {
    public void actualizarPosicion(Posicion posicion){
        posicion.moverDerecha();
    }
}
