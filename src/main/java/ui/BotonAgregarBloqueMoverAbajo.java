package ui;

import arrastrable.Arrastrable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

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
		
		this.setMargin(boton, new Insets(5,5,5,5));
		boton.setStyle("-fx-text-fill: white; -fx-background-color: plum;");
		boton.setMinSize(150, 50);
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		panel.agregarBloque(new BloqueMoverAbajoUI());
	}


}
