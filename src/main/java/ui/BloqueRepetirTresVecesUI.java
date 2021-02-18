package ui;

import bloque.Bloque;
import bloque.BloqueRepetir;
import javafx.scene.control.Label;

public class BloqueRepetirTresVecesUI extends BloqueUI {
	
	String msj = "Bloque Repetir Tres Veces - ";
	BloqueRepetir bloque; 
	
	public BloqueRepetirTresVecesUI(BloqueUI bloqueARepetir) {
		
		msj = msj + bloqueARepetir.mensaje();
		Label label = new Label(msj);
		this.getChildren().add(label);
		bloque = new BloqueRepetir(bloqueARepetir.devolverBloque(), 3);
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
