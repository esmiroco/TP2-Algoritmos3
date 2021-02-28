package handlers;


import bloque.Bloque;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import ui.ContenedorBloques;
import ui.Main;

public class HandlerBotonEjecutar implements EventHandler<ActionEvent>{
	
	private ContenedorBloques panel;
	private Main juego;

	public HandlerBotonEjecutar(ContenedorBloques panelEnviado, Main juegoEnviado) {
		panel = panelEnviado;
		juego = juegoEnviado;
	}
	
	@Override
	public void handle(ActionEvent e) {
		for (Bloque bloque : panel.getBloques()) {
			juego.ejecutarBloque(bloque);
		}
		panel.volverAEmpezar();
	}
		
}
