package ui;

import arrastrable.Arrastrable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueMoverArriba extends BotonUI{
	
	public Button boton;
	ContenedorBloques panel;
	Arrastrable arrastrable;
	
	public BotonAgregarBloqueMoverArriba(ContenedorBloques panelEnviado, Pane panelArrastrable){
		
		boton = new Button("Bloque Mover Arriba");
		panel = panelEnviado;
		arrastrable = new Arrastrable(this, panelArrastrable);
		arrastrable.ejecutar();
		this.getChildren().add(boton);
				
	}

	@Override
	public Button obtenerBoton(){ return boton;}

	@Override
	public void ejecutar(){
		panel.agregarBloque(new BloqueMoverArribaUI());
	}
}
