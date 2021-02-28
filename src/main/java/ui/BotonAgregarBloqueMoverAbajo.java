package ui;

import handlers.HandlerBloqueMoverAbajo;
import handlers.HandlerBloqueMoverArriba;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueMoverAbajo extends BotonUI{
	
	Button boton;
	
	public BotonAgregarBloqueMoverAbajo(ContenedorBloques panelEnviado){
		
		boton = new Button("Bloque Mover Abajo");
		boton.setOnAction(new HandlerBloqueMoverAbajo(panelEnviado));
		this.getChildren().add(boton);
	}


}
