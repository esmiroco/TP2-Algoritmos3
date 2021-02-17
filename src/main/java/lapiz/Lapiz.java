package lapiz;

import posicion.Posicion;
import tablero.Tablero;

public class Lapiz {
	private EstadoLapiz estado = new LapizArriba();
	
	public void pintar(Posicion posicion, Tablero tablero){
		try {
			estado.pintar(posicion, tablero);
		} 
		catch (NoSePintaConLapizArribaException e) {
		}

	}

	public void levantarLapiz() {
		estado = estado.levantarLapiz();
	}

	public void bajarLapiz() {
		estado = estado.bajarLapiz();
	}

}
