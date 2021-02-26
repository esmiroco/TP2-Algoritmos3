package ui;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueMoverAbajo extends BotonUI{
	
	Button boton;
	
	public BotonAgregarBloqueMoverAbajo(ContenedorBloques panelEnviado){
		boton = new BotonAgregarBloqueMover(panelEnviado, "Bloque Mover Abajo",  this);
		this.getChildren().add(boton);
	}

	@Override
	public BloqueUI crearBloque() {
		return new BloqueMoverAbajoUI();
	}

}
