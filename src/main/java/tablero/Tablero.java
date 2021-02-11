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
        boolean existe = posiciones.contains(posicion);
        if(!existe){ posiciones.add(posicion); }

    }

    public boolean existePosicion(Posicion posicion){
        return posiciones.contains(posicion);

    }
}


