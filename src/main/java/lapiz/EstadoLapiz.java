package lapiz;

import posicion.Posicion;
import tablero.Tablero;

public interface EstadoLapiz {

	public EstadoLapiz levantarLapiz();
	public EstadoLapiz bajarLapiz();
	public void pintar(Posicion posicion, Tablero tablero) throws NoSePintaConLapizArribaException;
}
