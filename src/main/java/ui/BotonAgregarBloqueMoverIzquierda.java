package ui;

import javafx.scene.layout.Pane;

public class BotonAgregarBloqueMoverIzquierda extends BotonUI{
	
	Pane panel;
	BotonAgregarBloqueMover boton;
	
	public BotonAgregarBloqueMoverIzquierda(Pane panelEnviado){
		
		boton = new BotonAgregarBloqueMover(panelEnviado, "Agregar Bloque Izquierda", this);
		this.getChildren().add(boton);
	}

	@Override
	public BloqueUI crearBloque() {
		return new BloqueMoverIzquierdaUI();
	}
}
