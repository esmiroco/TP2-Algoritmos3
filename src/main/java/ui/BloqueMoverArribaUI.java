package ui;

import bloque.Bloque;
import bloque.BloqueMovimiento;
import javafx.scene.control.Label;
import movimiento.MovArriba;

public class BloqueMoverArribaUI extends BloqueUI{
	
	String msj = "Bloque Mover Arriba";
	BloqueMovimiento bloque;
	
	public BloqueMoverArribaUI() {
		
		Label label = new Label(msj);
		this.getChildren().add(label);
		bloque = new BloqueMovimiento(new MovArriba());
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