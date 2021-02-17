package ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueMover extends Button{
	
	Pane panel;
	String mensaje;
	
	public BotonAgregarBloqueMover(Pane panelEnviado, String msj, BotonUI botonPadre){
		
		mensaje = msj;
		this.setText(mensaje);
		panel = panelEnviado;
		
		
		this.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				panel.getChildren().add(botonPadre.crearBloque());
				
			}
        });				
	}
}
