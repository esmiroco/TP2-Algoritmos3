package bloque;

import movimiento.Movimiento;
import personaje.Personaje;

public class BloqueRepetirDosVeces extends Bloque {
    private int repeticiones;

    private Movimiento movimiento;

    public BloqueRepetirDosVeces(Movimiento movimiento){
        this.movimiento = movimiento;
    }

    @Override
    public void ejecutar(Personaje personaje){
        for(int i = 0; i < 2; i++){
            personaje.mover(movimiento);
        }
    }
}
