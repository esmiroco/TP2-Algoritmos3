package ui;

import handlers.HandlerBotonEjecutar;
import handlers.HandlerJuego;
import javafx.scene.control.Button;

public class BotonEjecutar extends Button {
	
	public BotonEjecutar(ContenedorBloques panelEnviado, HandlerJuego handle) {
		this.setText("Ejecutar");
		this.setOnAction(new HandlerBotonEjecutar(panelEnviado, handle));
	}

}
