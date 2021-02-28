package ui;

import handlers.HandlerBloqueMoverIzquierda;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueMoverIzquierda extends BotonUI{
	
	Pane panel;	
	Button boton;
	
	public BotonAgregarBloqueMoverIzquierda(ContenedorBloques panelEnviado){
		
		boton = new Button("Bloque Mover Izquierda");
		boton.setOnAction(new HandlerBloqueMoverIzquierda(panelEnviado));
		this.getChildren().add(boton);
	}
}
