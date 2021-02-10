
package personaje;

import lapiz.Lapiz;
import posicion.Posicion;
import tablero.Tablero;
import movimiento.Movimiento;

public class Personaje {
	private Lapiz lapiz = new Lapiz();
	private Posicion posicion;
	private Tablero tablero;

	public Personaje(Posicion posicion, Tablero tableroEnviado) {
		this.posicion = posicion;
		this.tablero = tableroEnviado;
	}

	public void levantarLapiz() {
		lapiz.levantarLapiz();
		
	}

	public void bajarLapiz() {
		lapiz.bajarLapiz();
		
	}

	public void mover(Movimiento movimiento){
		Posicion posicionPrevia = posicion;
		movimiento.calcularNuevaPosicion(posicion);
		lapiz.pintar(posicionPrevia, posicion, tablero);
	}

}
