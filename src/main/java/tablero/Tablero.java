package tablero;

import posicion.Posicion;
import java. util. ArrayList;
import java.util.List;

public class Tablero {
    private List<Posicion> posiciones;

    public Tablero(){
        posiciones = new ArrayList<Posicion>();
    }

    public void almacenarPosicion(Posicion posicion){
       
        if(!existePosicion(posicion)){
        	posiciones.add(posicion); 
        }

    }

    public boolean existePosicion(Posicion posicion){
    	 boolean existe = false;
         for(Posicion pos : posiciones) {
         	if(posicion.esIgualA(pos)) {
         		existe = true;
         	}
         }
         return existe;
    }
}


