package personaje;

import lapiz.Lapiz;
import posicion.Posicion;

public class Personaje {
	private Lapiz lapiz = new Lapiz();
	private Posicion posicion;

	public void mover(Posicion nuevaPosicion) {
		posicion = nuevaPosicion;
		lapiz.pintar(nuevaPosicion);
		
	}

	public void levantarLapiz() {
		lapiz.levantarLapiz();
		
	}

	public void bajarLapiz() {
		lapiz.bajarLapiz();
		
	}

}
