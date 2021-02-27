package handlers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import ui.BotonUI;

public class HandlerBloqueMover implements EventHandler<ActionEvent>{
	
	private BotonUI botonPadre;
	private Pane panel;

	public HandlerBloqueMover(Pane panelEnviado, BotonUI botonPadreEnviado) {
		panel = panelEnviado;
		botonPadre = botonPadreEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		panel.getChildren().add(botonPadre.crearBloque());
		
	}
}
