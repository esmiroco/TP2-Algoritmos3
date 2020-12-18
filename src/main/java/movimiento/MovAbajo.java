package movimiento;

import posicion.Posicion;

public class MovAbajo implements Movimiento {
    public void calcularNuevaPosicion(Posicion posicion){
        posicion.moverAbajo();
    }
}
