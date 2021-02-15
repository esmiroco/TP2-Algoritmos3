package bloque;

import mapa.Mapa;
import personaje.Personaje;

public abstract class Bloque {
	
	public abstract void ejecutar(Personaje personaje, Mapa mapa);

	public abstract Bloque obtenerBloqueInvertido();
}
