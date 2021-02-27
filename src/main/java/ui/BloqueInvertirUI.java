package ui;

import bloque.Bloque;
import bloque.BloqueInvertirComportamiento;
import javafx.scene.control.Label;

public class BloqueInvertirUI extends BloqueUI {
	
	String msj = "Bloque Invertir - ";
	BloqueInvertirComportamiento bloque; 
	
	public BloqueInvertirUI(BloqueUI bloqueAInvertir) {
		
		msj = msj + bloqueAInvertir.mensaje();
		Label label = new Label(msj);
		this.getChildren().add(label);
		bloque = new BloqueInvertirComportamiento();
		bloque.agregarBloque(bloqueAInvertir.devolverBloque());
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
