package lapiz;

import posicion.Posicion;

public class Lapiz {
	
	private EstadoLapiz estado = new LapizArriba();
	
	public void pintar(Posicion posicion) {
		
		estado.pintar(posicion);
	}

	public void levantarLapiz() {
		estado = estado.levantarLapiz();
	}

	public void bajarLapiz() {
		estado = estado.bajarLapiz();
	}

}
