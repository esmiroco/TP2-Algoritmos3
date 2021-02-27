package lapiz;

import posicion.Posicion;

public class Lapiz {
	private EstadoLapiz estado = new LapizArriba();

	public void pintar(Posicion posicion){
		try {
			estado.pintar(posicion);
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
