package bloque;

import mapa.Mapa;
import personaje.Personaje;

public class BloqueLapizArriba extends Bloque{

	@Override
	public void ejecutar(Personaje personaje, Mapa mapa) {
		personaje.levantarLapiz();
		
	}

	@Override
	public Bloque obtenerBloqueInvertido() {
		return new BloqueLapizAbajo();
	}

}
