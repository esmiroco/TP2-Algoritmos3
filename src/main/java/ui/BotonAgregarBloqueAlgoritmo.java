package ui;

import bloque.BloqueAlgoritmo;
import handlers.HandlerBloqueAlgoritmo;
import javafx.scene.control.Button;

public class BotonAgregarBloqueAlgoritmo extends BotonUI{
	
	ContenedorBloques panel;
	BloqueAlgoritmo bloque = null;
	Button boton;
	
	public BotonAgregarBloqueAlgoritmo(ContenedorBloques panelEnviado){
		panel = panelEnviado;
		boton = new Button("Bloque Algoritmo");
		this.getChildren().add(boton);
		boton.setOnAction(new HandlerBloqueAlgoritmo(panelEnviado, this));
		boton.setDisable(true);
	}
	
	
	public BloqueUI getBloque() {
		BloqueAlgoritmoUI bloqueUI = new BloqueAlgoritmoUI(bloque);
		return bloqueUI;
	}

	public void agregarBloque(BloqueAlgoritmo bloqueAlgoritmo) {
		bloque = bloqueAlgoritmo;
		boton.setDisable(false);
		
		
	}

}
