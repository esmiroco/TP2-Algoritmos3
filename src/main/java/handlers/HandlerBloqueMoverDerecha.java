package handlers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import ui.BloqueMoverDerechaUI;
import ui.BloqueUI;
import ui.ContenedorBloques;

public class HandlerBloqueMoverDerecha implements EventHandler<ActionEvent>{
	
	private ContenedorBloques panel;

	public HandlerBloqueMoverDerecha(ContenedorBloques panelEnviado) {
		panel = panelEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		panel.agregarBloque(new BloqueMoverDerechaUI());
		
	}
}
