package movimiento;

import posicion.Posicion;

public class MovAbajo implements Movimiento {
    public void actualizarPosicion(Posicion posicion){
        posicion.moverAbajo();
    }
}
