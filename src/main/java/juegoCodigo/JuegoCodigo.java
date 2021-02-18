package juegoCodigo;

import java.util.ArrayList;

import bloque.Bloque;
import mapa.Mapa;
import personaje.Personaje;
import posicion.Posicion;

public class JuegoCodigo {
    private Mapa mapa = new Mapa();
    private Posicion posicion = new Posicion(0,0);
    private Personaje personaje = new Personaje(posicion);

    public ArrayList<Posicion> ejecutarBloque(Bloque bloque){
        return bloque.ejecutar(personaje, mapa);
        
    }
}