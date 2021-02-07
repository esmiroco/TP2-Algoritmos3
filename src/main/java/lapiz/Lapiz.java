package lapiz;

import posicion.Posicion;
import tablero.Tablero;

public class Lapiz {
	private Tablero tablero = new Tablero();
	private EstadoLapiz estado = new LapizArriba();
	
	public void pintar(Posicion posicionPrevia, Posicion posicion) {
		estado.pintar(posicionPrevia, posicion, tablero);
	}

	public void levantarLapiz() {
		estado = estado.levantarLapiz();
	}

	public void bajarLapiz() {
		estado = estado.bajarLapiz();
	}

}
