package movimiento;

import mapa.Mapa;
import posicion.Posicion;

public interface Movimiento {
    public Posicion actualizarPosicion(Posicion posicion, Mapa mapa);
    public Movimiento obtenerMovimientoInvertido();
}
