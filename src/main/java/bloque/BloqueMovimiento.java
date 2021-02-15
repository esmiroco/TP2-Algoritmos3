package bloque;

import mapa.Mapa;
import personaje.Personaje;
import movimiento.Movimiento;

public class BloqueMovimiento extends Bloque {

    private Movimiento movimiento;

    public BloqueMovimiento(Movimiento movimiento){
        this.movimiento = movimiento;
    }

    public void ejecutar(Personaje personaje, Mapa mapa){

        personaje.mover(movimiento, mapa);

    }

    public Bloque obtenerBloqueInvertido(){
        return new BloqueMovimiento(movimiento.obtenerMovimientoInvertido());
    }

}

