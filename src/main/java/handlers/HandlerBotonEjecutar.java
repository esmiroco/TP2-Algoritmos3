package handlers;


import bloque.Bloque;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import ui.ContenedorBloques;
import ui.Main;

public class HandlerBotonEjecutar implements EventHandler<ActionEvent>{
	
	private ContenedorBloques panel;
	private HandlerJuego juego;

	public HandlerBotonEjecutar(ContenedorBloques panelEnviado, HandlerJuego handler) {
		panel = panelEnviado;
		juego = handler;
	}
	
	@Override
	public void handle(ActionEvent e) {
		for (Bloque bloque : panel.getBloques()) {
			juego.ejecutarBloque(bloque);
		}
		juego.actualizarImagenes();
		panel.volverAEmpezar();
	}
		
}
