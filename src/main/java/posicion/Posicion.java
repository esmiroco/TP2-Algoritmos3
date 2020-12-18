package posicion;

import movimiento.Movimiento;

public class Posicion {

	private int posX;
	private int posY;

	public void pintate(){
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
	
}
