package ui;

import arrastrable.Arrastrable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

public class BotonAgregarBloqueMoverArriba extends BotonUI{
	
	public Button boton;
	ContenedorBloques panel;
	Arrastrable arrastrable;
	
	public BotonAgregarBloqueMoverArriba(ContenedorBloques panelEnviado){
		
		boton = new Button("Bloque Mover Arriba");
		panel = panelEnviado;
		arrastrable = new Arrastrable(this, panel);
		arrastrable.ejecutar();
		this.getChildren().add(boton);
		
		this.setMargin(boton, new Insets(5,5,5,5));
		boton.setStyle("-fx-text-fill: white; -fx-background-color: slateblue;");
		boton.setMinSize(150, 50);
				
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		panel.agregarBloque(new BloqueMoverArribaUI());
	}
}
