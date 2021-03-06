package posicion;

import estadoPintar.EstadoPintar;
import estadoPintar.EstadoSinPintar;
public class Posicion {

	private int posX;
	private int posY;
	private EstadoPintar estado;

	public Posicion(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
		estado=new EstadoSinPintar();
	}

	public boolean estoyPintado(){
		return estado.estoyPintado();
	}

	public void pintate(){
		estado=estado.pintar();
	}

	public void moverArriba(){
		posY = posY+1;
	}

	public void moverAbajo(){
		posY = posY-1;
	}

	public void moverDerecha(){
		posX = posX+1;
	}

	public void moverIzquierda(){
		posX= posX-1;
	}

	public int obtenerX(){
		return posX;
	}

	public int obtenerY(){
		return posY;
	}

	public boolean esIgualA(Posicion otraPosicion){
		return posX==otraPosicion.obtenerX() & posY==otraPosicion.obtenerY();
	}
}
