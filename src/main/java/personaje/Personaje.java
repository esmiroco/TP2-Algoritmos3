package personaje;

import lapiz.Lapiz;
import posicion.Posicion;
import movimiento.MovDerecha;
import movimiento.Movimiento;

public class Personaje {
	private Lapiz lapiz = new Lapiz();
	private Posicion posicion;

	public Personaje(Posicion posicion) {
		this.posicion = posicion;
	}

	public Personaje() {
	}


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

	public void mover(Movimiento movimiento){
		posicion.mover(movimiento);
	}

}
