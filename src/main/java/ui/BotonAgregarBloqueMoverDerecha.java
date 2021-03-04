package ui;

import arrastrable.Arrastrable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;

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
		boton.setStyle("-fx-text-fill: white; -fx-background-color: mediumblue ;");
		boton.setMinSize(150, 50);
		this.setMargin(boton, new Insets(5,5,5,5));
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		panel.agregarBloque(new BloqueMoverDerechaUI());
	}
}
