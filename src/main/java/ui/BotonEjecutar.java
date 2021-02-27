package ui;

import bloque.Bloque;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonEjecutar extends Button {
	
	public BotonEjecutar(ContenedorBloques panel, Main juego) {
		this.setText("Boton Ejecutar");
		this.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				for (Bloque bloque : panel.getBloques()) {
					juego.ejecutarBloque(bloque);
				}
				panel.volverAEmpezar();
			}
        });			
	}

}
