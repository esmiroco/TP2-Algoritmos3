package ui;

import bloque.Bloque;
import bloque.BloqueMovimiento;
import javafx.scene.control.Label;
import movimiento.MovDerecha;

public class BloqueMoverDerechaUI extends BloqueUI{
	
	String msj = "Bloque Mover Derecha";
	BloqueMovimiento bloque;
	
	public BloqueMoverDerechaUI() {
		
		Label label = new Label(msj);
		this.getChildren().add(label);
		bloque = new BloqueMovimiento(new MovDerecha());
	}

	@Override
	public String mensaje() {
		return msj;
	}
	
	@Override
	public Bloque devolverBloque() {
		return bloque;
	}
}