package bloque;

import mapa.Mapa;
import personaje.Personaje;

public class BloqueInvertirComportamiento extends Bloque{


    //private ArrayList<Bloque> listaBloques;

    BloqueAlgoritmo bloque = new BloqueAlgoritmo();

    //public BloqueInvertirComportamiento() {
     //   this.listaBloques = new ArrayList<>();
    //}

    public void agregarBloque(Bloque unBloque) {
        this.bloque.agregarBloque(unBloque);
    }


    @Override
    public void ejecutar(Personaje personaje, Mapa mapa) {
        this.bloque.obtenerBloqueInvertido().ejecutar(personaje,mapa);
    }

    @Override
    public Bloque obtenerBloqueInvertido() {
        return this.bloque.obtenerBloqueInvertido();
    }
}
