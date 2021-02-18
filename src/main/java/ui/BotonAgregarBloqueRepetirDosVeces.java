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
	
	Pane panel;
	HashMap<String, BotonUI> botones;
	BloqueUI bloque;
	MenuButton menu;
	
	public BotonAgregarBloqueRepetirDosVeces(Pane panelEnviado, HashMap<String, BotonUI> botonesEnviados){
		
		panel = panelEnviado;	
		menu = new MenuButton("Bloque Repetir Dos Veces");
		this.getChildren().add(menu);
		botones = botonesEnviados;
		this.addBotones();
	}
	
	
	@Override
	public BloqueUI crearBloque() {
		BloqueUI repetir = new BloqueRepetirDosVecesUI(bloque);
		return repetir;
	}
	
	private void addBotones() {
		
		EventHandler<ActionEvent> evento = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 
            	bloque = botones.get(((MenuItem) e.getSource()).getText()).crearBloque();
            	System.out.print(bloque + "\n");
    		    panel.getChildren().add(crearBloque());
            } 
        }; 
		
		for ( String key : botones.keySet() ) {
			MenuItem item = new MenuItem(key);
			item.setOnAction(evento);
			menu.getItems().add(item);
		}
		
	}

}
