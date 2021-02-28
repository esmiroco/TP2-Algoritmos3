package handlers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import ui.BloqueMoverAbajoUI;
import ui.BloqueMoverArribaUI;
import ui.BloqueUI;
import ui.ContenedorBloques;

public class HandlerBloqueMoverAbajo implements EventHandler<ActionEvent>{
	
	private ContenedorBloques panel;

	public HandlerBloqueMoverAbajo(ContenedorBloques panelEnviado) {
		panel = panelEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		panel.agregarBloque(new BloqueMoverAbajoUI());
		
	}
}
