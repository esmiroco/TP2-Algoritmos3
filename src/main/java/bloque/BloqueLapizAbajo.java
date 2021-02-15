package bloque;

import mapa.Mapa;
import personaje.Personaje;

public class BloqueLapizAbajo extends Bloque{

	@Override
	public void ejecutar(Personaje personaje, Mapa mapa) {
		personaje.bajarLapiz();
	}

	@Override
	public Bloque obtenerBloqueInvertido() {
		return new BloqueLapizArriba();
	}

}
