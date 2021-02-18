package juegoCodigo;

import bloque.Bloque;
import mapa.Mapa;
import personaje.Personaje;
import posicion.Posicion;

public class JuegoCodigo {
    private Mapa mapa = new Mapa();
    private Posicion posicion = new Posicion(5,4);
    private Personaje personaje = new Personaje(posicion);

    public void ejecutarBloque(Bloque bloque){
        bloque.ejecutar(personaje, mapa);
    }
}
