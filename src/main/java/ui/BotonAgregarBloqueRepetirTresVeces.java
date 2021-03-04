package ui;

import arrastrable.Arrastrable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

public class BotonAgregarBloqueRepetirTresVeces extends BotonUI{
	
	ContenedorBloques panel;
	BloqueUI bloque;
	Button boton;
	Arrastrable arrastrable;
	
	public BotonAgregarBloqueRepetirTresVeces(ContenedorBloques panelEnviado){
		panel = panelEnviado;
		boton = new Button("Bloque Repetir Tres Veces");
		this.getChildren().add(boton);
		arrastrable = new Arrastrable(this, panel);
		arrastrable.ejecutar();
		
		this.setMargin(boton, new Insets(5,5,5,5));
		boton.setStyle("-fx-text-fill: white; -fx-background-color: limegreen;");
		boton.setMinSize(150, 50);
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		BloqueUI bloque =  new BloqueRepetirTresVecesUI();
		panel.agregarBloque(bloque);
		panel.activarRecoleccionBloques((RecolectorBloques)bloque);
	}
}
