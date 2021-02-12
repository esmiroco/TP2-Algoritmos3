package bloque;

import personaje.Personaje;

import java.util.ArrayList;

public class BloqueAlgoritmo extends Bloque {

    private ArrayList<Bloque> listaBloques;

    public BloqueAlgoritmo() {
        this.listaBloques = new ArrayList<>();
    }

    public void agregarBloque(Bloque unBloque) {
        this.listaBloques.add(unBloque);
    }

    @Override
    public void ejecutar(Personaje personaje) {
        this.listaBloques.forEach(bloque -> bloque.ejecutar(personaje));
    }

    @Override
    public Bloque obtenerBloqueInvertido() {
        BloqueAlgoritmo bloqInvertidos = new BloqueAlgoritmo();
        this.listaBloques.forEach(bloque -> bloqInvertidos.agregarBloque(bloque.obtenerBloqueInvertido()));
        return bloqInvertidos;
    }

}
