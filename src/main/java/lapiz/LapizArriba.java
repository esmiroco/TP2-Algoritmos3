package lapiz;

import posicion.Posicion;

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
	public void pintar(Posicion posicion) throws NoSePintaConLapizArribaException {
		throw new NoSePintaConLapizArribaException();
	}


}
