package bloque;

import mapa.Mapa;
import personaje.Personaje;
import posicion.Posicion;

import java.util.ArrayList;

public class  BloqueAlgoritmo extends Bloque {

    private ArrayList<Bloque> listaBloques;

    public BloqueAlgoritmo() {
        this.listaBloques = new ArrayList<>();
    }

    public void agregarBloque(Bloque unBloque) {
        this.listaBloques.add(unBloque);
    }

    @Override
    public ArrayList<Posicion> ejecutar(Personaje personaje, Mapa mapa) {
    	ArrayList<Posicion> listaPos = new ArrayList<Posicion>();
    	
        this.listaBloques.forEach(bloque -> listaPos.addAll(bloque.ejecutar(personaje,mapa)));
        return listaPos;
    }

    @Override
    public Bloque obtenerBloqueInvertido() {
        BloqueAlgoritmo bloqInvertidos = new BloqueAlgoritmo();
        this.listaBloques.forEach(bloque -> bloqInvertidos.agregarBloque(bloque.obtenerBloqueInvertido()));
        return bloqInvertidos;
    }

}
