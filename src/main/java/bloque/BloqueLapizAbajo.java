package bloque;

import personaje.Personaje;

public class BloqueLapizAbajo extends Bloque{

	@Override
	public void ejecutar(Personaje personaje) {
		personaje.bajarLapiz();
		
	}

}
