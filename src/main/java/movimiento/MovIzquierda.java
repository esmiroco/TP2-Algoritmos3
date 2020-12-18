package movimiento;

import posicion.Posicion;

public class MovIzquierda implements Movimiento {
    public void calcularNuevaPosicion(Posicion posicion){
        posicion.moverIzquierda();
    }
}
