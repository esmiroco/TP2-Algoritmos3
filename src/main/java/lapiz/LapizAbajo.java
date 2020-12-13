package lapiz;

import posicion.Posicion;

public class LapizAbajo implements EstadoLapiz {

	@Override
	public void pintar(Posicion posicion) {
		posicion.pintate();
	}

	@Override
	public EstadoLapiz levantarLapiz() {
		return new LapizArriba();
	}

	@Override
	public EstadoLapiz bajarLapiz() {
		return this;
	}

}
