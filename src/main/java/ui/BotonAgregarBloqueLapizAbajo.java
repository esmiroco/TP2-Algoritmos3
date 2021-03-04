package ui;

import arrastrable.Arrastrable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

public class BotonAgregarBloqueLapizAbajo extends BotonUI{
	
	Button boton;
	String msj = "Bloque Lapiz Abajo";
	ContenedorBloques panel;
	Arrastrable arrastrable;
	
	public BotonAgregarBloqueLapizAbajo(ContenedorBloques panelEnviado){
		boton = new Button();
		boton.setText(msj);
		panel = panelEnviado;
		arrastrable = new Arrastrable(this, panel);
		arrastrable.ejecutar();
		this.getChildren().add(boton);
		this.setMargin(boton, new Insets(5,5,5,5));
		boton.setStyle("-fx-text-fill: white; -fx-background-color: mediumseagreen ;");
		boton.setMinSize(150, 50);
		
		
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		panel.agregarBloque(new BloqueLapizAbajoUI());
	}

}
