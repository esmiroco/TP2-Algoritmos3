package ui;

import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class BotonAgregarBloqueRepetirDosVeces extends BotonUI{
	
	ContenedorBloques panel;
	BloqueUI bloque;
	Button boton;
	
	public BotonAgregarBloqueRepetirDosVeces(ContenedorBloques panelEnviado){
		
		panel = panelEnviado;	
		boton = new Button("Bloque Repetir Dos Veces");
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
		BloqueUI repetir = new BloqueRepetirDosVecesUI();
		return repetir;
	}
	

}
