package ui;

import handlers.HandlerBloqueMoverArriba;
import javafx.scene.control.Button;

public class BotonAgregarBloqueMoverArriba extends BotonUI{
	
	public Button boton;
	
	public BotonAgregarBloqueMoverArriba(ContenedorBloques panelEnviado){
		
		boton = new Button("Bloque Mover Arriba");
		boton.setOnAction(new HandlerBloqueMoverArriba(panelEnviado));
		this.getChildren().add(boton);
				
	}
}
