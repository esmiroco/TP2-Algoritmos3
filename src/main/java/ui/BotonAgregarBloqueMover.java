package ui;

import handlers.HandlerBloqueMover;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueMover extends Button{
	String mensaje;
	
	public BotonAgregarBloqueMover(Pane panelEnviado, String msj, BotonUI botonPadre){
		
		mensaje = msj;
		this.setText(mensaje);

		
		this.setOnAction(new HandlerBloqueMover(panelEnviado, botonPadre));				
	}
}
