package handlers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import ui.BloqueInvertirUI;
import ui.BloqueUI;
import ui.ContenedorBloques;
import ui.RecolectorBloques;

public class HandlerBloqueInvertir implements EventHandler<ActionEvent>{
	
	private ContenedorBloques panel;

	public HandlerBloqueInvertir(ContenedorBloques panelEnviado) {
		panel = panelEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		BloqueUI bloque = new BloqueInvertirUI();
		panel.agregarBloque(bloque);
		panel.activarRecoleccionBloques((RecolectorBloques)bloque);
	}
}
