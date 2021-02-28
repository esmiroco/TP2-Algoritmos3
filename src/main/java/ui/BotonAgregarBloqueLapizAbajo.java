package ui;

import handlers.HandlerBloqueLapizAbajo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueLapizAbajo extends BotonUI{
	
	Button boton;
	String msj = "Bloque Lapiz Abajo";
	
	public BotonAgregarBloqueLapizAbajo(ContenedorBloques panelEnviado){
		boton = new Button();
		boton.setText(msj);
		
		boton.setOnAction(new HandlerBloqueLapizAbajo(panelEnviado));		
		this.getChildren().add(boton);
	}

}
