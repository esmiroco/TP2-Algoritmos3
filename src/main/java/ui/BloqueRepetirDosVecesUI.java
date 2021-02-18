package ui;

import bloque.Bloque;
import bloque.BloqueRepetir;
import javafx.scene.control.Label;

public class BloqueRepetirDosVecesUI extends BloqueUI {
	
	String msj = "Bloque Repetir Dos Veces - ";
	BloqueRepetir bloque; 
	
	public BloqueRepetirDosVecesUI(BloqueUI bloqueARepetir) {
		
		Label label = new Label(msj + bloqueARepetir.mensaje());
		this.getChildren().add(label);
		bloque = new BloqueRepetir(bloqueARepetir.devolverBloque(), 2);
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
