package coordenada;

import posicion.Posicion;

public class Coordenada {
    private int posX;
    private int posY;

    public Coordenada(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public int obtenerX(){
        return posX;
    }

    public int obtenerY(){
        return posY;
    }

    public boolean esIgualA(Coordenada otraCoordenada){
        if ((posX==otraCoordenada.obtenerX()) & (posY==otraCoordenada.obtenerY())){
            return true;
        }else{
            return false;
        }
    }
}
