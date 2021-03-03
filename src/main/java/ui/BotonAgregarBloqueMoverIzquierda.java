package ui;

import arrastrable.Arrastrable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueMoverIzquierda extends BotonUI{
	
	ContenedorBloques panel;
	Button boton;
	Arrastrable arrastrable;
	
	public BotonAgregarBloqueMoverIzquierda(ContenedorBloques panelEnviado){
		
		boton = new Button("Bloque Mover Izquierda");
		panel = panelEnviado;
		arrastrable = new Arrastrable(this, panel);
		arrastrable.ejecutar();
		this.getChildren().add(boton);
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		panel.agregarBloque(new BloqueMoverIzquierdaUI());
	}
}
