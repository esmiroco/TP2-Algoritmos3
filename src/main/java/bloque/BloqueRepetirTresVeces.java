package bloque;

import movimiento.Movimiento;
import personaje.Personaje;

public class BloqueRepetirTresVeces extends Bloque {
    private int repeticiones;

    private Movimiento movimiento;

    public BloqueRepetirTresVeces(Movimiento movimiento){
        this.movimiento = movimiento;
    }

    @Override
    public void ejecutar(Personaje personaje){
        for(int i = 0; i < 3; i++){
            personaje.mover(movimiento);
        }
    }
}


