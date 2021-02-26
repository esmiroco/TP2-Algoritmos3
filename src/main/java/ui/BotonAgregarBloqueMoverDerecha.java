package ui;

import javafx.scene.layout.Pane;

public class BotonAgregarBloqueMoverDerecha extends BotonUI{
	
	Pane panel;
	BotonAgregarBloqueMover boton;
	
	public BotonAgregarBloqueMoverDerecha(ContenedorBloques panelEnviado){
		
		boton = new BotonAgregarBloqueMover(panelEnviado, "Agregar Bloque Derecha", this);
		this.getChildren().add(boton);
	}

	@Override
	public BloqueUI crearBloque() {
		return new BloqueMoverDerechaUI();
	}
	
	
}
