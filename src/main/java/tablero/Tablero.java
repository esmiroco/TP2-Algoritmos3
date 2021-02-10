package tablero;

import coordenada.Coordenada;
import posicion.Posicion;
import java. util. ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Tablero {
    private List<Posicion> posiciones;

    public Tablero(){
        posiciones = new ArrayList<Posicion>();
    }

    public void almacenarPosicion(Posicion posicion){
        Boolean flag;
        Iterator i = posiciones.iterator();
        while(i.hasNext()){
            if((posicion.esIgualA(i)==true)){
                flag=true;
            }
        }
        if(flag==false){
            posiciones.add(posicion);
        }

    }
}
