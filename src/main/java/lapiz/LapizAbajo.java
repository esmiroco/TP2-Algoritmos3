package lapiz;

import posicion.Posicion;
import tablero.Tablero;

public class LapizAbajo implements EstadoLapiz {

//	@Override
	public void pintar(Posicion posicion, Tablero tablero) {
		tablero.almacenarPosicion(posicion);
	}

//	@Override
	public EstadoLapiz levantarLapiz() {
		return new LapizArriba();
	}

//	@Override
	public EstadoLapiz bajarLapiz() {
		return this;
	}

}
