package ui;

import bloque.Bloque;
import bloque.BloqueMovimiento;
import javafx.scene.control.Label;
import movimiento.MovAbajo;


public class BloqueMoverAbajoUI extends BloqueUI{
	
	String msj = "Bloque Mover Abajo";
	BloqueMovimiento bloque;
	
	public BloqueMoverAbajoUI() {
		
		Label label = new Label(msj);
		this.getChildren().add(label);
		bloque = new BloqueMovimiento(new MovAbajo());
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