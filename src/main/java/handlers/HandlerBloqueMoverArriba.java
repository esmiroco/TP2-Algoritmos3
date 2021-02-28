package handlers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import ui.BloqueMoverArribaUI;
import ui.BloqueUI;
import ui.ContenedorBloques;

public class HandlerBloqueMoverArriba implements EventHandler<ActionEvent>{

	private ContenedorBloques panel;

	public HandlerBloqueMoverArriba(ContenedorBloques panelEnviado) {
		panel = panelEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		panel.agregarBloque(new BloqueMoverArribaUI());
		
	}
}
