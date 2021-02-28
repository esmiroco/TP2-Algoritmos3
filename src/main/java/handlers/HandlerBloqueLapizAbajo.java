package handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import ui.BloqueLapizAbajoUI;
import ui.BloqueUI;
import ui.ContenedorBloques;

public class HandlerBloqueLapizAbajo implements EventHandler<ActionEvent>{
	
	private ContenedorBloques panel;

	public HandlerBloqueLapizAbajo(ContenedorBloques panelEnviado) {
		panel = panelEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		panel.agregarBloque(new BloqueLapizAbajoUI());
	}
}
