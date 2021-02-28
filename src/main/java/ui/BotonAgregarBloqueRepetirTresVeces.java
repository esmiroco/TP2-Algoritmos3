package ui;

import handlers.HandlerBloqueRepetirTresVeces;
import javafx.scene.control.Button;

public class BotonAgregarBloqueRepetirTresVeces extends BotonUI{
	
	ContenedorBloques panel;
	BloqueUI bloque;
	Button boton;
	
	public BotonAgregarBloqueRepetirTresVeces(ContenedorBloques panelEnviado){
		panel = panelEnviado;
		boton = new Button("Bloque Repetir Tres Veces");
		this.getChildren().add(boton);
		boton.setOnAction(new HandlerBloqueRepetirTresVeces(panelEnviado));
	}
	
}
