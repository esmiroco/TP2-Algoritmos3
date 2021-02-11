package lapiz;

import posicion.Posicion;
import tablero.Tablero;

public class LapizArriba implements EstadoLapiz {

	@Override
	public EstadoLapiz bajarLapiz() {
		return new LapizAbajo();

	}
	
	@Override
	public EstadoLapiz levantarLapiz() {
		return this;
	}
	
	@Override
	public void pintar(Posicion posicion, Tablero tablero) throws NoSePintaConLapizArribaException {
		throw new NoSePintaConLapizArribaException();
	}

}
