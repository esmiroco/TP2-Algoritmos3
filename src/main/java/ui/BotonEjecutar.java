package ui;

import handlers.HandlerBotonEjecutar;
import javafx.scene.control.Button;

public class BotonEjecutar extends Button {
	
	public BotonEjecutar(ContenedorBloques panel, Main juego) {
		this.setText("Boton Ejecutar");
		this.setOnAction(new HandlerBotonEjecutar(panel, juego));		
	}

}
