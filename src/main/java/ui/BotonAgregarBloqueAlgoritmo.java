package ui;

import bloque.BloqueAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonAgregarBloqueAlgoritmo extends BotonUI{
	
	ContenedorBloques panel;
	BloqueUI bloque = null;
	Button boton;
	
	public BotonAgregarBloqueAlgoritmo(ContenedorBloques panelEnviado){
		panel = panelEnviado;
		boton = new Button("Bloque Algoritmo");
		this.getChildren().add(boton);
		boton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				panel.agregarBloque(bloque);
			}
        });
		boton.setDisable(true);
	}
	
	@Override
	public BloqueUI crearBloque() {
		return bloque;
	}
	
	public void agregarBloqueUI(BloqueUI bloqueEnviado) {
		bloque = bloqueEnviado;
		boton.setDisable(false);
	}
	

}
