package bloque;

import java.util.ArrayList;

import mapa.Mapa;
import personaje.Personaje;
import posicion.Posicion;

public class BloqueRepetir extends Bloque {

    private int repeticiones;

    private Bloque bloque;

    public BloqueRepetir(Bloque bloqueEnviado, int conRepeticiones) {
        this.bloque = bloqueEnviado;
        this.repeticiones = conRepeticiones;
    }


    @Override
    public ArrayList<Posicion> ejecutar(Personaje personaje, Mapa mapa) {
    	ArrayList<Posicion> listaPos = new ArrayList<Posicion>();
        for (int i = 0; i < this.repeticiones; i++) {
            listaPos.addAll(bloque.ejecutar(personaje, mapa));
        }
        return listaPos;
    }

    @Override
    public Bloque obtenerBloqueInvertido() {
        return bloque.obtenerBloqueInvertido();
    }

}
