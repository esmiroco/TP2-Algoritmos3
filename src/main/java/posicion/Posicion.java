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

	public void mover(Movimiento movimiento){
		posX = movimiento.desplazarX(posX);
		posY = movimiento.desplazarY(posY);
	}

	public int obtenerX(){
		return posX;
	}

	public int obtenerY(){
		return posY;
	}
	
}
