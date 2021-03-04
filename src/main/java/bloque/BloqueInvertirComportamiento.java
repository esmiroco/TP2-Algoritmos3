package bloque;

import java.util.ArrayList;

import mapa.Mapa;
import personaje.Personaje;
import posicion.Posicion;

public class BloqueInvertirComportamiento extends Bloque{

    BloqueAlgoritmo bloque = new BloqueAlgoritmo();

    public void agregarBloque(Bloque unBloque) {
        this.bloque.agregarBloque(unBloque);
    }

    @Override
    public ArrayList<Posicion> ejecutar(Personaje personaje, Mapa mapa) {
    	return this.bloque.obtenerBloqueInvertido().ejecutar(personaje,mapa);
    }

    @Override
    public Bloque obtenerBloqueInvertido() {
        return this.bloque.obtenerBloqueInvertido();
    }

}
