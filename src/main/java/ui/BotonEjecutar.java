package ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import juego.Main;

public class BotonEjecutar extends Button {
	
	public BotonEjecutar(Pane panel, Main juego) {
		this.setText("Boton Ejecutar");
		this.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				for (Node children : panel.getChildren()) {
					juego.ejecutarBloque(((BloqueUI) children).devolverBloque());
					//System.out.print(((BloqueUI)children).mensaje() + "\n");
				}
				panel.getChildren().clear();
			}
        });			
	}

}
