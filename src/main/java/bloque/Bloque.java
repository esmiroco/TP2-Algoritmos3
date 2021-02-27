package bloque;

import java.util.ArrayList;

import mapa.Mapa;
import personaje.Personaje;
import posicion.Posicion;

public abstract class Bloque {
	
	public abstract ArrayList<Posicion> ejecutar(Personaje personaje, Mapa mapa);

	public abstract Bloque obtenerBloqueInvertido();
}
