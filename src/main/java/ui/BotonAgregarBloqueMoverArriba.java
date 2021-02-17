package ui;

import javafx.scene.layout.Pane;

public class BotonAgregarBloqueMoverArriba extends BotonUI{
	
	public BotonAgregarBloqueMover boton;
	
	public BotonAgregarBloqueMoverArriba(Pane panelEnviado){
		
		boton = new BotonAgregarBloqueMover(panelEnviado, "Bloque Mover Arriba", this);
		this.getChildren().add(boton);
				
	}

	@Override
	public BloqueUI crearBloque() {
		return new BloqueMoverArribaUI();
	}

}
