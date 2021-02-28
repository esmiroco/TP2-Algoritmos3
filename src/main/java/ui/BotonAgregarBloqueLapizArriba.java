package ui;

import handlers.HandlerBloqueLapizArriba;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueLapizArriba extends BotonUI{
	
	Button boton;
	String msj = "Bloque Lapiz Arriba";
	
	public BotonAgregarBloqueLapizArriba(ContenedorBloques panelEnviado){
		boton = new Button();
		boton.setText(msj);
		
		boton.setOnAction(new HandlerBloqueLapizArriba(panelEnviado));		
		this.getChildren().add(boton);
	}

}
