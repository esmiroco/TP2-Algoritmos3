package lapiz;

import posicion.Posicion;
import tablero.Tablero;

public interface EstadoLapiz {

	public EstadoLapiz levantarLapiz();
	public EstadoLapiz bajarLapiz();
	public void pintar(Posicion posicionPrevia, Posicion posicion, Tablero tablero);
}
