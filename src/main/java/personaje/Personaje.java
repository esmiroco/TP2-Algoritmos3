
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

	public Posicion levantarLapiz() {
		lapiz.levantarLapiz();
		return posicion;
		
	}

	public Posicion bajarLapiz() {
		lapiz.bajarLapiz();
		return posicion;
		
	}

	public Posicion mover(Movimiento movimiento, Mapa mapa){
		posicion=movimiento.actualizarPosicion(posicion, mapa);
		lapiz.pintar(posicion);
		return posicion;
	}

	public Posicion obtenerPosicion(){
		return posicion;
	}
}
