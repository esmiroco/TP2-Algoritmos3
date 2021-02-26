package ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonAgregarBloqueInvertir extends BotonUI{
	
	ContenedorBloques panel;
	BloqueUI bloque;
	Button boton;
	
	public BotonAgregarBloqueInvertir(ContenedorBloques panelEnviado){
		panel = panelEnviado;
		boton = new Button("Bloque Invertir");
		this.getChildren().add(boton);
		boton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				bloque = crearBloque();
				panel.agregarBloque(bloque);
				panel.activarRecoleccionBloques((RecolectorBloques)bloque);
			}
        });
	}
	
	
	@Override
	public BloqueUI crearBloque() {
		BloqueUI invertir = new BloqueInvertirUI();
		return invertir;
	}
	

}
