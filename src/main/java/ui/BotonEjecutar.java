package ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonEjecutar extends Button {
	
	public BotonEjecutar(ContenedorBloques panel, Main juego) {
		this.setText("Boton Ejecutar");
		this.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				for (Node children : panel.getBloques()) {
					juego.ejecutarBloque(((BloqueUI) children).devolverBloque());
				}
				panel.volverAEmpezar();
			}
        });			
	}

}
