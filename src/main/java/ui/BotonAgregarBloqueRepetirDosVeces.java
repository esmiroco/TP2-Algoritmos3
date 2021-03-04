package ui;

import arrastrable.Arrastrable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

public class BotonAgregarBloqueRepetirDosVeces extends BotonUI{
	
	ContenedorBloques panel;
	BloqueUI bloque;
	Button boton;
	Arrastrable arrastrable;
	
	public BotonAgregarBloqueRepetirDosVeces(ContenedorBloques panelEnviado){
		
		panel = panelEnviado;	
		boton = new Button("Bloque Repetir Dos Veces");
		this.getChildren().add(boton);
		arrastrable = new Arrastrable(this, panel);
		arrastrable.ejecutar();
		
		this.setMargin(boton, new Insets(5,5,5,5));
		boton.setStyle("-fx-text-fill: white; -fx-background-color: royalblue;");
		boton.setMinSize(150, 50);
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		BloqueUI bloque = new BloqueRepetirDosVecesUI();
		panel.agregarBloque(bloque);
		panel.activarRecoleccionBloques((RecolectorBloques)bloque);
	}

}
