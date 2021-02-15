package lapiz;

import posicion.Posicion;

public interface EstadoLapiz {

	public EstadoLapiz levantarLapiz();
	public EstadoLapiz bajarLapiz();
	public void pintar(Posicion posicion) throws NoSePintaConLapizArribaException;
}
