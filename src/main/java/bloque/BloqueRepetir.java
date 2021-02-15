package bloque;

import mapa.Mapa;
import personaje.Personaje;

public class BloqueRepetir extends Bloque {

    private int repeticiones;

    private Bloque bloque;

    public BloqueRepetir(Bloque bloqueEnviado, int conRepeticiones) {
        this.bloque = bloqueEnviado;
        this.repeticiones = conRepeticiones;
    }


    @Override
    public void ejecutar(Personaje personaje, Mapa mapa) {
        for (int i = 0; i < this.repeticiones; i++) {
            bloque.ejecutar(personaje, mapa);
        }
    }

    @Override
    public Bloque obtenerBloqueInvertido() {
        return bloque.obtenerBloqueInvertido();
    }

}
