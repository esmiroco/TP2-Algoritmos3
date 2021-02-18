package bloque;

import java.util.ArrayList;

import mapa.Mapa;
import personaje.Personaje;
import posicion.Posicion;
import movimiento.Movimiento;

public class BloqueMovimiento extends Bloque {

    private Movimiento movimiento;

    public BloqueMovimiento(Movimiento movimiento){
        this.movimiento = movimiento;
    }

    public ArrayList<Posicion> ejecutar(Personaje personaje, Mapa mapa){
    	ArrayList<Posicion> listaPos = new ArrayList<Posicion>();
        listaPos.add(personaje.mover(movimiento, mapa));
        
        return listaPos;

    }

    public Bloque obtenerBloqueInvertido(){
        return new BloqueMovimiento(movimiento.obtenerMovimientoInvertido());
    }

}

