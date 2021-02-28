package ui;

import handlers.HandlerBloqueRepetirDosVeces;
import javafx.scene.control.Button;

public class BotonAgregarBloqueRepetirDosVeces extends BotonUI{
	
	ContenedorBloques panel;
	BloqueUI bloque;
	Button boton;
	
	public BotonAgregarBloqueRepetirDosVeces(ContenedorBloques panelEnviado){
		
		panel = panelEnviado;	
		boton = new Button("Bloque Repetir Dos Veces");
		this.getChildren().add(boton);
		boton.setOnAction(new HandlerBloqueRepetirDosVeces(panelEnviado));
	}

}
