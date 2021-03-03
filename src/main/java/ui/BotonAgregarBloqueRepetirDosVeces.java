package ui;

import arrastrable.Arrastrable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueRepetirDosVeces extends BotonUI{
	
	ContenedorBloques panel;
	BloqueUI bloque;
	Button boton;
	Arrastrable arrastrable;
	
	public BotonAgregarBloqueRepetirDosVeces(ContenedorBloques panelEnviado, Pane panelArrastrable){
		
		panel = panelEnviado;	
		boton = new Button("Bloque Repetir Dos Veces");
		this.getChildren().add(boton);
		arrastrable = new Arrastrable(this, panelArrastrable);
		arrastrable.ejecutar();
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
