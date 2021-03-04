package ui;

import arrastrable.Arrastrable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

public class BotonAgregarBloqueInvertir extends BotonUI{
	
	ContenedorBloques panel;
//	BloqueUI bloque;
	Button boton;
	Arrastrable arrastrable;
	
	public BotonAgregarBloqueInvertir(ContenedorBloques panelEnviado){
		panel = panelEnviado;
		boton = new Button("Bloque Invertir");
		this.getChildren().add(boton);
		arrastrable = new Arrastrable(this, panel);
		arrastrable.ejecutar();
		
		boton.setMinSize(150, 50);
		
		boton.setStyle("-fx-text-fill: white; -fx-background-color: lightcoral ;");
		boton.setMinSize(150, 50);
		this.setMargin(boton, new Insets(5,5,5,5));
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		BloqueUI bloque = new BloqueInvertirUI();
		panel.agregarBloque(bloque);
		panel.activarRecoleccionBloques((RecolectorBloques)bloque);
	}

}
