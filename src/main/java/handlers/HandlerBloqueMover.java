package handlers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import ui.BotonUI;
import ui.ContenedorBloques;

public class HandlerBloqueMover implements EventHandler<ActionEvent>{
	
	private BotonUI botonPadre;
	private ContenedorBloques panel;

	public HandlerBloqueMover(ContenedorBloques panelEnviado, BotonUI botonPadreEnviado) {
		panel = panelEnviado;
		botonPadre = botonPadreEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		panel.agregarBloque(botonPadre.crearBloque());
		
	}
}
