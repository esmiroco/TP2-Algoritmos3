package bloque;

import personaje.Personaje;

public class BloqueRepetirDosVeces extends Bloque {
    private int repeticiones;

    private Bloque bloque;

    public BloqueRepetirDosVeces(Bloque bloqueEnviado){
        this.bloque = bloqueEnviado;
    }

    @Override
    public void ejecutar(Personaje personaje){
        for(int i = 0; i < 2; i++){
        	bloque.ejecutar(personaje);
        }
    }
}
