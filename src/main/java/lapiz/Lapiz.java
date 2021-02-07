package lapiz;

import posicion.Posicion;
import tablero.Tablero;

public class Lapiz {
	private EstadoLapiz estado = new LapizArriba();
	
	public void pintar(Posicion posicionPrevia, Posicion posicion, Tablero tablero) {
		estado.pintar(posicionPrevia, posicion, tablero);
	}

	public void levantarLapiz() {
		estado = estado.levantarLapiz();
	}

	public void bajarLapiz() {
		estado = estado.bajarLapiz();
	}

}
