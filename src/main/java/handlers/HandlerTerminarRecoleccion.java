package handlers;


import java.util.ArrayList;

import bloque.Bloque;
import bloque.BloqueAlgoritmo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import ui.BloqueAlgoritmoUI;
import ui.BotonUI;
import ui.ContenedorBloques;
import ui.Main;

public class HandlerTerminarRecoleccion implements EventHandler<ActionEvent>{
	
	private ContenedorBloques panel;
	
	public HandlerTerminarRecoleccion(ContenedorBloques contenedor) {
		panel = contenedor;
	}
	
	@Override
	public void handle(ActionEvent e) {
		panel.desactivarRecoleccionBloques();
	}
}
