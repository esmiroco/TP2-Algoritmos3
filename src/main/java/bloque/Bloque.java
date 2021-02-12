package bloque;

import personaje.Personaje;

public abstract class Bloque {
	
	public abstract void ejecutar(Personaje personaje);

	public abstract Bloque obtenerBloqueInvertido();
}
