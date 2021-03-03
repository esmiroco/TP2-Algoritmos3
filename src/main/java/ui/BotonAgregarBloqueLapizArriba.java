package ui;

import arrastrable.Arrastrable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueLapizArriba extends BotonUI{
	
	Button boton;
	String msj = "Bloque Lapiz Arriba";
	ContenedorBloques panel;
	Arrastrable arrastrable;
	
	public BotonAgregarBloqueLapizArriba(ContenedorBloques panelEnviado){
		boton = new Button();
		boton.setText(msj);
		panel = panelEnviado;
		arrastrable = new Arrastrable(this, panel);
		arrastrable.ejecutar();
		this.getChildren().add(boton);
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		panel.agregarBloque(new BloqueLapizArribaUI());
	}

}
