package ui;

import arrastrable.Arrastrable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

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
		
		this.setMargin(boton, new Insets(5,5,5,5));
		boton.setStyle("-fx-text-fill: white; -fx-background-color: rosybrown;");
		boton.setMinSize(150, 50);
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		panel.agregarBloque(new BloqueMoverIzquierdaUI());
	}
}
