package bloque;

import personaje.Personaje;
import movimiento.Movimiento;

public class BloqueMovimiento extends Bloque {

    private Movimiento movimiento;

    public BloqueMovimiento(Movimiento movimiento){
        this.movimiento = movimiento;
    }

    public void ejecutar(Personaje personaje){

        personaje.mover(movimiento);

    }

    public Bloque obtenerBloqueInvertido(){
        return new BloqueMovimiento(movimiento.obtenerMovimientoInvertido());
    }

}

