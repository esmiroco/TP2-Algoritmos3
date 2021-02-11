package tablero;

import posicion.Posicion;
import java. util. ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private List<Posicion> posiciones;

    public Tablero(){
        posiciones = new ArrayList<Posicion>();
    }

    public void almacenarPosicion(Posicion posicion){
        Boolean flag = false;
        for (Posicion pos : posiciones) {
        	if(posicion.esIgualA(pos)){
                flag = true;
            }
        }
        if(!flag){
            posiciones.add(posicion);
        }

    }
}
