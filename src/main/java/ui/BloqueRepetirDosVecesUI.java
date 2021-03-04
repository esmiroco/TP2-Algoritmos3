package ui;

import bloque.Bloque;
import bloque.BloqueRepetir;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class BloqueRepetirDosVecesUI extends BloqueUI implements RecolectorBloques{
	
	String msj = "Bloque Repetir Dos Veces - ";
	BloqueRepetir bloque; 
	
	public BloqueRepetirDosVecesUI() {
		
		Label label = new Label(msj);
		this.getChildren().add(label);
		bloque = new BloqueRepetir(2);
		
		this.setAlignment(Pos.CENTER);
		label.setStyle("-fx-text-fill: white;");
		this.setStyle("-fx-background-color: royalblue;");
	}

	@Override
	public String mensaje() {
		return msj;
	}

	@Override
	public Bloque devolverBloque() {
		return bloque;
	}
	
	@Override
	public void agregarBloque(Pane bloqueEnviado) {
		this.getChildren().add(bloqueEnviado);
		bloque.agregarBloque(((BloqueUI) bloqueEnviado).devolverBloque());
	}

}
