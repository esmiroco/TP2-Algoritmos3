
package personaje;

import lapiz.Lapiz;
import mapa.Mapa;
import posicion.Posicion;
import movimiento.Movimiento;


public class Personaje {
	private Lapiz lapiz = new Lapiz();
	private Posicion posicion;

	public Personaje(Posicion posicion) {
		this.posicion = posicion;
	}

	public void levantarLapiz() {
		lapiz.levantarLapiz();
		
	}

	public void bajarLapiz() {
		lapiz.bajarLapiz();
		
	}

	public void mover(Movimiento movimiento, Mapa mapa){
		posicion=movimiento.actualizarPosicion(posicion, mapa);
		lapiz.pintar(posicion);
	}

	public Posicion obtenerPosicion(){
		return posicion;
	}
}
