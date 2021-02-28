package handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import ui.BloqueLapizArribaUI;
import ui.BloqueUI;
import ui.ContenedorBloques;

public class HandlerBloqueLapizArriba implements EventHandler<ActionEvent>{
	
	private ContenedorBloques panel;

	public HandlerBloqueLapizArriba(ContenedorBloques panelEnviado) {
		panel = panelEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		panel.agregarBloque(new BloqueLapizArribaUI());
	}
}
