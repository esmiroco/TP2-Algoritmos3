package ui;

import handlers.HandlerBloqueMoverDerecha;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueMoverDerecha extends BotonUI{
	
	Pane panel;
	Button boton;
	
	public BotonAgregarBloqueMoverDerecha(ContenedorBloques panelEnviado){
		
		boton = new Button("Bloque Mover Derecha");
		boton.setOnAction(new HandlerBloqueMoverDerecha(panelEnviado));
		this.getChildren().add(boton);
	}

}
