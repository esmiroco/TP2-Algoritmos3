package bloque;

import java.util.ArrayList;

import mapa.Mapa;
import personaje.Personaje;
import posicion.Posicion;

public class BloqueLapizArriba extends Bloque{

	@Override
	public ArrayList<Posicion> ejecutar(Personaje personaje, Mapa mapa) {
		ArrayList<Posicion> listaPos = new ArrayList<Posicion>();
		listaPos.add(personaje.levantarLapiz());
		return listaPos;
		
	}

	@Override
	public Bloque obtenerBloqueInvertido() {
		return new BloqueLapizAbajo();
	}

}
