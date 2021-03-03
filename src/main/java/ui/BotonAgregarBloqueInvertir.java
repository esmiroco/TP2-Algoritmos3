package ui;

import arrastrable.Arrastrable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

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
