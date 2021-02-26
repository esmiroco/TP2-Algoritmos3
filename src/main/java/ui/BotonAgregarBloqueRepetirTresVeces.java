package ui;

import java.util.HashMap;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class BotonAgregarBloqueRepetirTresVeces extends BotonUI{
	
	ContenedorBloques panel;
	BloqueUI bloque;
	Button boton;
	
	public BotonAgregarBloqueRepetirTresVeces(ContenedorBloques panelEnviado){
		panel = panelEnviado;
		boton = new Button("Bloque Repetir Tres Veces");
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
		BloqueUI repetir = new BloqueRepetirTresVecesUI();
		return repetir;
	}
	
}
