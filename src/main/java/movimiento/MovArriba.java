package movimiento;

import posicion.Posicion;

public class MovArriba implements Movimiento {
    public void calcularNuevaPosicion(Posicion posicion){
        posicion.moverArriba();
    }
}
