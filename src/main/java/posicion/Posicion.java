package posicion;

import tablero.Tablero;

public class Posicion {

	private int posX;
	private int posY;
	private EstadoPintar estado = new EstadoSinPintar();

	public void pintate(Tablero tablero){
		estado = estado.pintar();
		// avisar a tablero que estoy pintado
	}

	public Posicion(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
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
		if ((posX==otraPosicion.obtenerX()) & (posY==otraPosicion.obtenerY())){
			return true;
		}else{
			return false;
		}
	}
}
