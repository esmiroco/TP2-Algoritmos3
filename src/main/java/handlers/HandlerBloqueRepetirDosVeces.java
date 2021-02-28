package handlers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import ui.BloqueMoverIzquierdaUI;
import ui.BloqueRepetirDosVecesUI;
import ui.BloqueUI;
import ui.ContenedorBloques;
import ui.RecolectorBloques;

public class HandlerBloqueRepetirDosVeces implements EventHandler<ActionEvent>{
	
	private ContenedorBloques panel;

	public HandlerBloqueRepetirDosVeces(ContenedorBloques panelEnviado) {
		panel = panelEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		BloqueUI bloque = new BloqueRepetirDosVecesUI();
		panel.agregarBloque(bloque);
		panel.activarRecoleccionBloques((RecolectorBloques)bloque);
	}
}
