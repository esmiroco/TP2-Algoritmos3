package ui;

import arrastrable.Arrastrable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueMoverDerecha extends BotonUI{
	
	ContenedorBloques panel;
	Button boton;
	Arrastrable arrastrable;
	
	public BotonAgregarBloqueMoverDerecha(ContenedorBloques panelEnviado){
		
		boton = new Button("Bloque Mover Derecha");
		panel = panelEnviado;
		arrastrable = new Arrastrable(this, panel);
		arrastrable.ejecutar();
		this.getChildren().add(boton);
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		panel.agregarBloque(new BloqueMoverDerechaUI());
	}
}
