package handlers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import ui.BloqueRepetirTresVecesUI;
import ui.BloqueUI;
import ui.ContenedorBloques;
import ui.RecolectorBloques;

public class HandlerBloqueRepetirTresVeces implements EventHandler<ActionEvent>{
	
	private ContenedorBloques panel;

	public HandlerBloqueRepetirTresVeces(ContenedorBloques panelEnviado) {
		panel = panelEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		BloqueUI bloque =  new BloqueRepetirTresVecesUI();
		panel.agregarBloque(bloque);
		panel.activarRecoleccionBloques((RecolectorBloques)bloque);
	}
}
