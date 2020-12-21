package movimiento;

import posicion.Posicion;

public class MovDerecha implements Movimiento {
    public void calcularNuevaPosicion(Posicion posicion){
        posicion.moverDerecha();
    }
}
