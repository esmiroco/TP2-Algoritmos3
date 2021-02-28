package handlers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import ui.BloqueMoverDerechaUI;
import ui.BloqueUI;
import ui.BotonAgregarBloqueAlgoritmo;
import ui.ContenedorBloques;

public class HandlerBloqueAlgoritmo implements EventHandler<ActionEvent>{
	
	private ContenedorBloques panel;
	BotonAgregarBloqueAlgoritmo botonPadre;

	public HandlerBloqueAlgoritmo(ContenedorBloques panelEnviado, BotonAgregarBloqueAlgoritmo boton) {
		botonPadre = boton;
		panel = panelEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		panel.agregarBloque(botonPadre.getBloque());
		
	}
}
