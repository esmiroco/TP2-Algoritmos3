package ui;

import handlers.HandlerBloqueInvertir;
import javafx.scene.control.Button;

public class BotonAgregarBloqueInvertir extends BotonUI{
	
	ContenedorBloques panel;
	BloqueUI bloque;
	Button boton;
	
	public BotonAgregarBloqueInvertir(ContenedorBloques panelEnviado){
		panel = panelEnviado;
		boton = new Button("Bloque Invertir");
		this.getChildren().add(boton);
		boton.setOnAction(new HandlerBloqueInvertir(panelEnviado));
	}

}
