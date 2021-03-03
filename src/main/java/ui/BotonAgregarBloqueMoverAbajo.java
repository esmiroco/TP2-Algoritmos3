package ui;

import arrastrable.Arrastrable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueMoverAbajo extends BotonUI{
	
	Button boton;
	ContenedorBloques panel;
	Arrastrable arrastrable;
	
	public BotonAgregarBloqueMoverAbajo(ContenedorBloques panelEnviado){
		
		boton = new Button("Bloque Mover Abajo");
		panel = panelEnviado;
		arrastrable = new Arrastrable(this, panel);
		arrastrable.ejecutar();
		this.getChildren().add(boton);
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		panel.agregarBloque(new BloqueMoverAbajoUI());
	}


}
