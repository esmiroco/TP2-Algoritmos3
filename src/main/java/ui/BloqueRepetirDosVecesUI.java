package ui;

import javafx.scene.control.Label;

public class BloqueRepetirDosVecesUI extends BloqueUI {
	
	String msj = "Bloque Repetir Dos Veces - ";
	
	public BloqueRepetirDosVecesUI(BloqueUI bloqueARepetir) {
		
		Label label = new Label(msj + bloqueARepetir.mensaje());
		this.getChildren().add(label);
	}

	@Override
	public String mensaje() {
		return msj;
	}

}
