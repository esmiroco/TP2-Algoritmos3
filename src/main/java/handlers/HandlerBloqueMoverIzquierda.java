package handlers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import ui.BloqueMoverIzquierdaUI;
import ui.BloqueUI;
import ui.ContenedorBloques;

public class HandlerBloqueMoverIzquierda implements EventHandler<ActionEvent>{
	
	private ContenedorBloques panel;

	public HandlerBloqueMoverIzquierda(ContenedorBloques panelEnviado) {
		panel = panelEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		panel.agregarBloque(new BloqueMoverIzquierdaUI());
		
	}
}
