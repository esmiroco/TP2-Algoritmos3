package bloque;

import personaje.Personaje;

public class BloqueLapizArriba extends Bloque{

	@Override
	public void ejecutar(Personaje personaje) {
		personaje.levantarLapiz();
		
	}

}