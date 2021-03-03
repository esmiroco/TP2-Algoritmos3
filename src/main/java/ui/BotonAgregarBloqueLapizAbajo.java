package ui;

import arrastrable.Arrastrable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueLapizAbajo extends BotonUI{
	
	Button boton;
	String msj = "Bloque Lapiz Abajo";
	ContenedorBloques panel;
	Arrastrable arrastrable;
	
	public BotonAgregarBloqueLapizAbajo(ContenedorBloques panelEnviado, Pane panelArrastrable){
		boton = new Button();
		boton.setText(msj);
		panel = panelEnviado;
		arrastrable = new Arrastrable(this, panelArrastrable);
		arrastrable.ejecutar();
		this.getChildren().add(boton);
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		panel.agregarBloque(new BloqueLapizAbajoUI());
	}

}
